package ProfessorJean.ListaFor;

import java.util.Scanner;

public class Alg206
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite qual a quantidade de numeros serao digitados: ");
        int numero = input.nextInt();
        int maior = numero;
        int menor = numero;

        for(int i = 1; i <= numero; i++)
        {
            System.out.print("digite um numero: ");
            int n1 = input.nextInt();

            if(n1 > maior)
            {
                maior = n1;
            }
            else if(n1 < menor)
            {
                menor = n1;
            }
        }
        System.out.println("Maior: " + maior + "\n" + "Menor: " + menor);
    }
}