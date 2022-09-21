package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg62
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Valor produto: ");
        double produto = input.nextDouble();

        double desconto = produto * (1 - 0.09);

        System.out.printf("Valor com desconto: %.2f", desconto);
    }
}
