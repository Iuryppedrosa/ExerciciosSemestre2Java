package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg80Test
{
    public static void main(String[] args)
    {
        Alg80 metodo = new Alg80();
        System.out.println(metodo.Numero());


        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero de 3 digitos: ");
        int numeroValor = input.nextInt();

        int C = numeroValor % 10;
        int B = numeroValor / 10 % 10;
        int A = numeroValor / 100;

        int mais = numeroValor + ((C * 100) + (10 * B) + A);

        int maisC = mais % 10;
        int maisB = mais / 10 % 10;
        int maisA = mais / 100;

        int verificador = (maisA * 3) + (maisB * 2) + maisC;


        System.out.printf("Digito: %d", verificador);
    }
}
