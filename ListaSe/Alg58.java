package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg58
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double xnum1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double xnum2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double xnum3 = input.nextDouble();

        double x = xnum1 + (xnum2 / xnum3 + xnum1) + (2 * (xnum1 - xnum2)) + log(64, 2);

        System.out.printf("O valor de X é %.3f", x);
    }
    public static double log (double base, double valor)
    {
        return Math.log(base) / Math.log(valor);
    }
}
