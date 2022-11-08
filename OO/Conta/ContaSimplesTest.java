package ProfessorJeanEMarcos.OO.Conta;

public class ContaSimplesTest
{
    public static void main(String[] args)
    {
        ContaSimples conta1 = new ContaSimples(123, "Joao");

        System.out.println(conta1.getSaldo());
        conta1.depositar(30.0);
        System.out.println(conta1.getSaldo());
        conta1.sacar(15.0);
        System.out.println(conta1.getSaldo());

        System.out.println();

        ContaSimples conta2 = new  ContaSimples(456, "Pedro");
        System.out.println(conta2.getSaldo());
        conta2.depositar(100.0);
        System.out.println(conta2.getSaldo());
        conta2.sacar(120.0);
        System.out.println(conta2.getSaldo());
    }
}
