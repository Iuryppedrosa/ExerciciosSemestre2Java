package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg53
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Lado A: ");
        double ladoA = input.nextDouble();

        System.out.print("Lado B: ");
        double ladoB = input.nextDouble();

        System.out.print("Lado C: ");
        double ladoC = input.nextDouble();

        double diagonal = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2) + Math.pow(ladoC, 2));

        System.out.printf("Diagonal: %.2f", diagonal);

    }
}
