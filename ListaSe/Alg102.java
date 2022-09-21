package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg102
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero?");
        int numero = input.nextInt();

        if(numero > 20)
            System.out.println("maior que 20");
        else if (numero == 20)
            System.out.println("igual a 20");
        else System.out.println("menor que 20");

    }
}
