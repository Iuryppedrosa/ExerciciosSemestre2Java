package ProfessorJean;

import java.util.Scanner;

public class Alg69
{
    public static void main(String[] args)
    {
        double decimal;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o numerador: ");
        double numerador = input.nextInt();

        System.out.print("Digite o denominador: ");
        double denominador = input.nextInt();

        decimal = numerador / denominador;

        System.out.printf("Resultado %.2f", decimal);
    }
}
