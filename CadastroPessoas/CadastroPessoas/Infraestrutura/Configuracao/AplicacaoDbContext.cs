using Base;
using Microsoft.EntityFrameworkCore;

namespace Infraestrutura.Configuracao
{
    public class AplicacaoDbContext : DbContext
    {
        
        public AplicacaoDbContext(DbContextOptions<AplicacaoDbContext> options) : base(options) { }

        public DbSet<Usuario> Usuarios { get; set; }
    }
}