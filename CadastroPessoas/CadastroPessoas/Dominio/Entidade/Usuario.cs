using System.ComponentModel.DataAnnotations.Schema;

namespace Base
{
    [Table("USERS", Schema = "GESTAO_CORPORATIVA")]
    public class Usuario : Base
    {
        [Column("NOME")]
        public string Nome { get; set; }

        [Column("CPF")]
        public string CPF { get; set; }

        [Column("PASSWORD")]
        public string Senha { get; set; }

        [Column("EMAIL")]
        public string Email { get; set; }

        [Column("MATRICULA")]
        public string Matricula { get; set; }

        [Column("ATIVO")]
        public int Ativo { get; set; }

    }
}