package ProfessorJeanEMarcos.ProfessorMarcus.Aula11Exercicios;

import java.util.Scanner;

public class MarcusAlg
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        System.out.print("Digite X: ");
        int X = input.nextInt();
        System.out.print("Digite Y:");
        int Y = input.nextInt();



        if (X < Y)
        {
            int i = X + 1;
            while (i < Y)
            //for (int i = X + 1; i < Y; i++)
            {
                if (i % 2 != 0)
                {
                    soma += i;
                }
                i++;
            }
        } else
        {
            int i = Y + 1;
            while (i < X)
            //for (int i = Y + 1; i < X; i++)
            {
                if (i % 2 != 0)
                {
                    soma += i;
                }
                i++;
            }
        }
        System.out.println(soma);
    }
}
