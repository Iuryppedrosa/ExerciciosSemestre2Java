package ProfessorJean;

import java.util.Map;
import java.util.Scanner;

public class Alg137
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double d = 0;
        double x1 = 0;
        double x2 = 0;

        System.out.print("Valor de A: ");
        double a = input.nextDouble();

        System.out.print("Valor de B: ");
        double b = input.nextDouble();

        System.out.print("Valor de C: ");
        double c = input.nextDouble();

        if(a == 0)
            System.out.println("Nao a equacao de 2 grau.");
        else
            d = b * 2 - 4 * a * c;

        if (d >= 0)
        {
            d = Math.sqrt(d);
            x1 = (-b + d) / (2 * a);
            x2 = (- b - d) / (2 * a);

            System.out.print("X1: " + x1 + "\n" + "X2: " + x2);
        }else System.out.println("Nao ha raizes reais.");

    }
}
