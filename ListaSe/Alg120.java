package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg120
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a > b && a > c)
        {
            int maior = a;
            System.out.println(maior);
        }else if (b > a && b > c)
        {
            int maior = b;
            System.out.println(maior);
        }else
        {
            int maior = c;
            System.out.println(maior);
        }
    }
}
