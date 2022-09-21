package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg55
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a Diagonal 1: ");
        double diagonal1 = input.nextDouble();

        System.out.print("Digite a altura: ");
        double diagonal2 = input.nextDouble();

        double area = (diagonal1 * diagonal2) / 2;

        System.out.printf("Area: %.2f", area);

    }
}
