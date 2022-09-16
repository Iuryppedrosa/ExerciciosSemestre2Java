package ProfessorJean;

import java.util.Scanner;

public class Alg91
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int numero1 = input.nextInt();

        System.out.print("Entre com um numero: ");
        int numero2 = input.nextInt();

        int resultado = numero1 + numero2;

        if(resultado > 10)
        {
            System.out.println("Resultado: " + resultado);
        }
    }
}
