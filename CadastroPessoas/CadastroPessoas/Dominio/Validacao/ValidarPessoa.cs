using Base;
using FluentValidation;

namespace CadastroPessoas.Dominio.Validacao
{
    public class ValidarPessoa : AbstractValidator<Usuario>
    {
        public ValidarPessoa()
        {
            RuleFor(p => p.Nome)
            .NotEmpty().WithMessage("Nome obrigatório.");

            RuleFor(p => p.CPF)
            .NotEmpty().WithMessage("CPF obrigatório.")
            .Matches(@"^\d{11}$").WithMessage("CPF deve conter 11 dígitos.");

            RuleFor(p => p.Matricula)
            .NotEmpty().WithMessage("Matrícula obrigatório.");

            RuleFor(p => p.Senha)
            .NotEmpty().WithMessage("Senha obrigatório.")
            .Matches(@"^(?=.*[A-Z]).{8,}$").WithMessage("Senha deve conter 8 caracteres e uma letra maiúscula");

            RuleFor(p => p.Email)
            .NotEmpty().WithMessage("Email obrigatório.")
            .Matches(@"^(?!:\/\/)([a-zA-Z0-9._%+-]+)@([a-zA-Z0-9.-]+)\.([a-zA-Z]{2,})$")
            .WithMessage("Email tem que ser válido.");

            RuleFor(p => p.Ativo)
            .NotNull().WithMessage("Cadastro ativo ou inativo deve ser obrigatório.")
            .InclusiveBetween(0, 1).WithMessage("Cadastro deve ser 0(inativo) ou 1(ativo)");
        }
    }
}