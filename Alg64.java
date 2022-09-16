package ProfessorJean;

import java.util.Scanner;

public class Alg64
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Centígrados: ");
        double tempC = input.nextDouble();

        double tempF = ((9 * tempC) + 160) / 5;

        System.out.printf("Esta temperatura em Fahrenheit é %.2f", tempF);
    }
}
