package ProfessorJean.ListaFor;

import java.util.Scanner;

public class Alg189
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Maior temp em fahrenheit: ");
        int f1 = input.nextInt();

        System.out.print("Menor temp em fah...   :");
        int f2 = input.nextInt();

        System.out.print("Decremento: ");
        int dec = input.nextInt();

        for(int i = f1; i >= f2; i -= dec)
        {
            double celcius = 5 * (i - 32) / 9;
            System.out.println("Em celcius: " + celcius);
        }


    }
}
