package ProfessorJean;

import java.util.Scanner;

public class Alg91
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        double numero1 = input.nextDouble();

        System.out.print("Entre com outro numero: ");
        double numero2 = input.nextDouble();

        if((numero1 + numero2) > 10)
        {
            System.out.println("É mair do que 10.");
        }else System.out.println(".");
    }
}
