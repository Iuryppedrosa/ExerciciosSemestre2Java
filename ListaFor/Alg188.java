package ProfessorJean.ListaFor;

import java.util.Scanner;

public class Alg188
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Polegadas para centimetros.");

        for(int i = 1; i <= 20; i++)
        {
            System.out.println(i + " Polegadas é equivalente " + i * 2.54 + "cm");

        }

    }
}
