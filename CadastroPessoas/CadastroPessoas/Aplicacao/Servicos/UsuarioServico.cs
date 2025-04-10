using Base;
using CadastroPessoas.Dominio.Validacao;
using Dominio.Interface;
using FluentValidation;

namespace Aplicacao
{
    public class UsuarioServico
    {
        private readonly IUsuarioRepositorio _usuarioRepositorio;
        private readonly IValidator<Usuario> _validarUsuario;

        public UsuarioServico(IUsuarioRepositorio usuarioRepositorio)
        {
            _usuarioRepositorio = usuarioRepositorio;
            _validarUsuario = new ValidarPessoa();
        }

        public async Task<Usuario> ListarUsuariosPorIdAsync(int Id)
        {
            var usuario = await _usuarioRepositorio.ListarUsuariosPorIdAsync(Id);
            if (usuario == null)
                throw new KeyNotFoundException($"Usuário com ID {Id} não encontrado");

            return usuario;
        }

        public async Task<(bool Sucesso, IEnumerable<string> Erros)> CadastrarUsuarioAsync(Usuario usuario)
        {
            var resultadoValidacao = await _validarUsuario.ValidateAsync(usuario);
            if (!resultadoValidacao.IsValid)
                return (false, resultadoValidacao.Errors.Select(e => e.ErrorMessage));

            await _usuarioRepositorio.CadastrarUsuarioAsync(usuario);
            return (true, Enumerable.Empty<string>());
        }

        public async Task<(bool Sucesso, IEnumerable<string> Erros)> AtualizarUsuarioAsync(int id, Usuario usuario)
        {
            if (usuario.Id != id)
                return (false, new[] { "ID não encontrado." });

            var resultadoValidacao = await _validarUsuario.ValidateAsync(usuario);
            if (!resultadoValidacao.IsValid)
                return (false, resultadoValidacao.Errors.Select(e => e.ErrorMessage));

            await _usuarioRepositorio.AtualizarUsuarioAsync(usuario);
            return (true, Enumerable.Empty<string>());
        }

        public async Task<Usuario> DeletarUsuarioAsync(int Id)
        {
            var usuarioExistente = await _usuarioRepositorio.ListarUsuariosPorIdAsync(Id);
            if (usuarioExistente == null)
                throw new KeyNotFoundException($"Usuário com ID {Id} não encontrado.");

            await _usuarioRepositorio.DetelarUsuarioAsync(Id);
            return usuarioExistente;
        }

        public async Task<List<Usuario>> ListarUsuariosAsync()
        {
            return await _usuarioRepositorio.ListarUsuariosAsync();
        }
    }
}