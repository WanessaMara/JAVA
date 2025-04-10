namespace Aplicacao.Excecao
{
    public class CpfInvalidoExcecao : Exception
    {
        public CpfInvalidoExcecao(string menssage) : base(menssage) { }
    }

    public class EmailInvalidoExcecao : Exception
    {
        public EmailInvalidoExcecao(string menssage) : base(menssage) { }
    }

    public class NomeInvalidoExcecao : Exception
    {
        public NomeInvalidoExcecao(string menssage) : base(menssage) { }
    }

    public class MatriculaInvalidaExcecao : Exception
    {
        public MatriculaInvalidaExcecao(string menssage) : base(menssage) { }
    }
    public class SenhaInvalidaExcecao : Exception
    {
        public SenhaInvalidaExcecao(string menssage) : base(menssage) { }
    }
}