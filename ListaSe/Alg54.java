package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg54
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = input.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = input.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("Area: %.2f", area);

    }
}
