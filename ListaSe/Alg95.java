package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg95
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int numero = input.nextInt();

        if((numero % 5) == 0)
        {
            System.out.println("É multiplo de 5");
        }else System.out.println("Não é multiplo de 5");

    }
}
