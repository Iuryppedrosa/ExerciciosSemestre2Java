package ProfessorJeanEMarcos.AgenciaBancaria;

import ProfessorJeanEMarcos.AgenciaBancaria.Utilitarios.Utils;

import javax.swing.*;

public class Conta
{
    private static int counterAccount = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta()
    {
    }

    public Conta(Pessoa pessoa)
    {
        this.numeroConta = counterAccount;
        this.pessoa = pessoa;
        counterAccount += 1;
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta)
    {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa()
    {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa)
    {
        this.pessoa = pessoa;
    }

    public Double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(Double saldo)
    {
        this.saldo = saldo;
    }

    @Override
    public String toString()
    {
        return "\nNome: " + this.pessoa.getNome() +
                "\nNumero da conta: " + this.getNumeroConta() +
                "\nCpf: " + this.pessoa.getCpf() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                "\n";
    }

    public void depositar(Double valor)
    {
        if(valor > 0)
        {
            setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!!");
            //System.out.println("Depósito realizado com sucesso!!");
        } else
        JOptionPane.showMessageDialog(null, "Nao foi possível realizar o depósito!!");
            //System.out.println("Nao foi possível realizar o depósito!!");
    }

    public void sacar(Double valor)
    {
        if(valor > 0 && this.getSaldo() >= valor)
        {
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!!");
            //System.out.println("Saque realizado com sucesso!!");
        }else
        JOptionPane.showMessageDialog(null, "Nao foi possível realizar o saque!!");
            //System.out.println("Nao foi possível realizar o saque!!");
    }

    public void transferir(Conta contaParaTransferencia, Double valor)
    {
        if(valor > 0 && this.getSaldo() >= valor)
        {
            setSaldo(getSaldo() - valor);
            contaParaTransferencia.saldo = contaParaTransferencia.getSaldo() + valor;
            JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso!!!");
            //System.out.println("Transferencia realizada com sucesso!!!");
        }else
            JOptionPane.showMessageDialog(null, "Nao foi possível realizar a transferencia!!");
            //System.out.println("Nao foi possível realizar a transferencia!!");
    }
}
