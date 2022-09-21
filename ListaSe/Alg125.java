package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg125
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade? ");
        int a = input.nextInt();

        if(a >= 18)
            System.out.println("Maior de idade.");
        else if (a > 65)
            System.out.println("Maior que 65");
        else System.out.println("Menor de idade");

    }
}
