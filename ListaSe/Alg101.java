package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg101
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero?");
        int numero = input.nextInt();

        if((numero > 20) && (numero < 90))
        {
            System.out.println("sim");
        }else System.out.println("nao");
    }
}
