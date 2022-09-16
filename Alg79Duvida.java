package ProfessorJean;

import java.util.Scanner;

public class Alg79Duvida
{
    public static void main(String[] args)
    {
        double rate = 0.014;
        double resultado = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("Qual será sua aplicação mensal? ");
        double aplicacaoMensal = input.nextDouble();

        System.out.printf("Por quanto tempo vc quer investir? ");
        int numeroMeses = input.nextInt();

        resultado = aplicacaoMensal * (Math.pow(1 + rate, numeroMeses) - 1) / rate;

        System.out.printf("Resultado: %.2f.", resultado);
    }
}
