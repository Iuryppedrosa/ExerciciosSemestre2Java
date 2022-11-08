package ProfessorJeanEMarcos.ListaArray;

import java.util.Scanner;

public class Alg353
{
    public static void main(String[] args)
    {
        int i;
        Scanner input = new Scanner(System.in);

        String[] vetor = new String[3];

        for(i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite um nome: ");
            String palavra = input.nextLine();

            vetor[i] = palavra;
        }
        for(i = 0; i < vetor.length; i++)
        {
            System.out.printf("Palavra %s = %s%n", i + 1, vetor[i]);
        }
    }
}
