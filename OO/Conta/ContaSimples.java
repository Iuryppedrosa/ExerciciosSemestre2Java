package ProfessorJeanEMarcos.OO.Conta;

public class ContaSimples
{
    private int numeroDaConta;
    private String nome;
    private double saldo;

    public ContaSimples(int numeroDaConta, String nome)
    {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void depositar(double saldo)
    {
        this.saldo += saldo;
    }

    public void sacar(double valor)
    {
        if(this.saldo > valor)
        {
            this.saldo -= valor;
        }else
        {
            System.out.println("Saque indisponível por falta de saldo.");
        }
    }
}

