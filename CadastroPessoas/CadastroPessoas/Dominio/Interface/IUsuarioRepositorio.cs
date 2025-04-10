using Base;

namespace Dominio.Interface
{
    public interface IUsuarioRepositorio
    {
        Task<List<Usuario>> ListarUsuariosAsync();

        Task<Usuario> ListarUsuariosPorIdAsync(int Id);

        Task CadastrarUsuarioAsync(Usuario usuario);

        Task AtualizarUsuarioAsync(Usuario usuario);

        Task DetelarUsuarioAsync(int Id);

    }
}