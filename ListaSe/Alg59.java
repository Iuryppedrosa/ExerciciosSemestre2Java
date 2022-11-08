package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg59
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double cateto1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double cateto2 = input.nextDouble();

        double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        double hipotenusa2 = Math.sqrt(hipotenusa);

        System.out.printf("Hipotenusa: %.2f", hipotenusa2);
    }
}
