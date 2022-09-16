package ProfessorJean;

import java.util.Scanner;

public class Alg50
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual a base do retangulo? ");
        double base = input.nextDouble();

        System.out.print("Qual a altura do retangulo? ");
        double altura = input.nextDouble();

        double perimetro = 2 * altura + 2 * base;
        double area = base * altura;
        double diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("Perimetro: %.2f%nArea: %.2f%nDiagonal: %.2f%n", perimetro, area, diagonal);
    }
}
