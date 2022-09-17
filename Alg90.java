package ProfessorJean;

import java.util.Scanner;

public class Alg90
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Entre com um numero: ");
        double numero = input.nextDouble();

        if(numero > 20)
        {
            System.out.println("É maior que 20");
        }else System.out.println("Entre com outro numero.");

    }
}
