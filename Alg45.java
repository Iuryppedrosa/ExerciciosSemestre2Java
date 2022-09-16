package ProfessorJean;

import java.util.Scanner;

public class Alg45
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = input.nextInt();

        double valor = Math.pow(n, 2);
        double valorRaiz = Math.sqrt(n);

        System.out.printf("Numero: %d%nNumero ao quadrado: %.2f%nRaiz do numero: %.2f", n, valor, valorRaiz);

    }
}
