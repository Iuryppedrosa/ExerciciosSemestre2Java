package ProfessorJean;

import java.util.Scanner;

public class Alg151
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Seu peso: ");
        double peso = input.nextDouble();

        System.out.println("Sua altura: ");
        double altura = input.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Imc: " + imc);
    }
}
