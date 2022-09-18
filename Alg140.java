package ProfessorJean;

import java.util.Scanner;

public class Alg140
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do cliente: ");
        String nome = input.next().toLowerCase();

        System.out.println("Valor da conta: ");
        double valorConta = input.nextDouble();

        Character letraInicial = nome.charAt(0);

        if (letraInicial.equals('a') || letraInicial.equals('d') || letraInicial.equals('m') || letraInicial.equals('s'))
        {
            double desconto = valorConta * (1 - 0.3);
            System.out.printf("%s o valor da sua conta com desconto é %.2f", nome, desconto);
        }else
            System.out.println("Que pena pra vc.");
    }
}
