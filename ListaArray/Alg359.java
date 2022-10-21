package ProfessorJean.ListaArray;

import java.util.Scanner;

public class Alg359
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = 5;
        String[] nome = new String[n];
        int[] idades = new int[n];

        for(int i = 0; i < nome.length; i++)
        {
            System.out.print("Digite seu nome: ");
            nome[i] = input.next();

            System.out.print("Digite sua idade: ");
            idades[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            char letra = nome[i].toUpperCase().charAt(0);

            if(letra >= 76 && letra <= 83 && idades[i] > 18)
            {
                System.out.printf("Nome está entre L e S: %s%nE idade maior que 18: %d%n", nome[i], idades[i]);
            }
        }


    }
}
