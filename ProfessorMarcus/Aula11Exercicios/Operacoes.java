package ProfessorJeanEMarcos.ProfessorMarcus.Aula11Exercicios;

import java.util.Scanner;

public class Operacoes
{
    public static double soma(double a, double b)
    {
        return a + b;
    }

    public static double multiplicacao(double a, double b)
    {
        return a * b;
    }

    public static double divisao(double a, double b)
    {
        double resultado = a / b;
        return resultado;
    }

    public static void exibe(double a, double b, double c)
    {
        System.out.println("Resultado: \n" + a + "\n" + b + "\n" + c);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um valor real para x: ");
        double x = input.nextDouble();

        System.out.print("Entre com um valor real para y: ");
        double y = input.nextDouble();

        exibe(soma(x, y), multiplicacao(x, y), divisao(x, y));
    }
}
