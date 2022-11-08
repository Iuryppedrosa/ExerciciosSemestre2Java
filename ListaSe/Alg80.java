package ProfessorJeanEMarcos.ListaSe;
import java.util.Scanner;

public class Alg80
{
    public int Numero()
    {
        int numeroInvertido = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numero da conta: ");
        int numero = input.nextInt();
        int numeroTest = numero;

        while (numero > 0)
        {
            numeroInvertido = numeroInvertido * 10;
            numeroInvertido = numeroInvertido + (numero % 10);
            numero = numero / 10;
        }
        return numeroInvertido + numeroTest;
    }
}
