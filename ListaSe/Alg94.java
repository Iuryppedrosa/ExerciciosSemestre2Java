package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg94
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int numero = input.nextInt();

        if((numero % 3) == 0)
        {
            System.out.println("É multiplo de 3");
        }else System.out.println("Não é multiplo de 3");
    }
}
