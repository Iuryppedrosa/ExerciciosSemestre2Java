package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg111A114
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = input.nextInt();

        System.out.print("Digite outro numero: ");
        int n2 = input.nextInt();

        int maior = 0;

        if(n1 > maior)
        {
            maior = n1;
            if(n2 > maior)
            {
                maior = n2;
            }
        }

        int menor = 0;
        System.out.print("Digite mais um numero: ");
        int n3 = input.nextInt();

        System.out.print("Digite outra vez um numero: ");
        int n4 = input.nextInt();

        if(n3 < n4)
        {
            menor = n3;
        }else if (n3 > n4)
        {
            menor = n4;
        }

        System.out.print("Digite numero: ");
        int n5 = input.nextInt();

        System.out.print("Digite numero denovo: ");
        int n6 = input.nextInt();

        if(n5 > n6)
        {
            System.out.println("Crescente: " + n5 + ", " + n6);
        }else if (n5 < n6)
            System.out.printf("Crescente: "+ n5 + ", " + n6);
        System.out.println();


        System.out.print("Digite numero: ");
        int n7 = input.nextInt();

        System.out.print("Digite numero denovo: ");
        int n8 = input.nextInt();

        if(n7 < n8)
        {
            System.out.println("Decrescente: "+ n8 + ", " + n7);
        }else if(n7 > n8)
            System.out.printf("Decrescente: "+ n7 + ", " + n8);

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
