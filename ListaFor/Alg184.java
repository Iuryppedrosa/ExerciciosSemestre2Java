package ProfessorJean.ListaFor;

import java.util.Scanner;

public class Alg184
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i <= 8; i++)
        {
            System.out.println("Digite um numero: ");
            double numero = input.nextDouble();

            if(numero > 0)
            {
                double logResult = Math.log(numero) / Math.log(10);
                System.out.println("Resultado: "+ logResult);

            }else System.out.println("Negativo");

        }


    }
}
