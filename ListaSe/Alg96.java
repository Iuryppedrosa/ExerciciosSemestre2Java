package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg96
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        double numero = input.nextDouble();

        if((numero % 10 == 0) && (numero % 5 == 0) && (numero % 2 == 0))
        {
            System.out.println("é divisível");
        } else
            System.out.println("Não é divisível");

    }
}
