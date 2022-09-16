package ProfessorJean;

import java.util.Scanner;

public class Alg90
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int numero = input.nextInt();

        if(numero > 20)
        {
            System.out.println("Maior que 20");
        }
    }
}
