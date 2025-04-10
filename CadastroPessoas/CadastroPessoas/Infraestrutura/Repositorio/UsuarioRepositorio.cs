using Base;
using Dominio.Interface;
using Infraestrutura.Configuracao;
using Microsoft.EntityFrameworkCore;

namespace CadastroPessoas.Infraestrutura
{
    public class UsuarioRepositorio : IUsuarioRepositorio
    {
        private readonly AplicacaoDbContext _context;

        public UsuarioRepositorio(AplicacaoDbContext context)
        {
            _context = context;
        }


        public async Task AtualizarUsuarioAsync(Usuario usuarioAtualizado)
        {
            if (usuarioAtualizado.Id == 0)
            {
                throw new ArgumentException("Id do usuário não encontrado.");
            }

            var usuarioExistente = await _context.Usuarios.FindAsync(usuarioAtualizado.Id);

            if (usuarioExistente == null)
            {
                throw new KeyNotFoundException("Usuário não encontrado.");
            }

            _context.Entry(usuarioExistente).CurrentValues.SetValues(usuarioAtualizado);
            await _context.SaveChangesAsync();
        }

        public async Task CadastrarUsuarioAsync(Usuario usuario)
        {
            await _context.Usuarios.AddAsync(usuario);
            await _context.SaveChangesAsync();
        }

        public async Task DetelarUsuarioAsync(int Id)
        {
            var usuario = await _context.Usuarios.FindAsync(Id);
            if (usuario != null)
            {
                _context.Usuarios.Remove(usuario);
                await _context.SaveChangesAsync();
            }

        }

        public async Task<List<Usuario>> ListarUsuariosAsync()
        {
            return await _context.Usuarios.ToListAsync();
        }

        public async Task<Usuario> ListarUsuariosPorIdAsync(int Id)
        {
            return await _context.Usuarios.FindAsync(Id);
        }
    }
}