package ProfessorJean.ProfessorMarcus;

import java.util.Scanner;

public class Ex4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        double media;


        System.out.print("Digite um numero para repeticao: ");
        int n = input.nextInt();

        int[] valores = new int[n];

        for(int i = 0; i < valores.length; i++)
        {
            System.out.print("Digites seus numeros: ");
            valores[i] = input.nextInt();

            soma += valores[i];
        }
        for(int i : valores)
        {
            System.out.println(i);
        }
        System.out.println(soma);
        media = soma / valores.length;
        System.out.println("Media: " + media);
    }
}
