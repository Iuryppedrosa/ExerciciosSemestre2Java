package ProfessorJean;

import java.util.Scanner;

public class Alg47
{
    public static void main(String[] args)
    {
        int numeroInvertido = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        while (numero > 0)
        {
            numeroInvertido = numeroInvertido * 10;
            numeroInvertido = numeroInvertido + (numero % 10);
            numero = numero / 10;
        }
        System.out.printf("Numero invertido: %d", numeroInvertido);
    }
}
