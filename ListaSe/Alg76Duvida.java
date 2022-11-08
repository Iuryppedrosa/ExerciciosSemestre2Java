package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg76Duvida
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero de 0 a 60: ");
        int numero = input.nextInt();

        int valor = (numero % 2) + 1 * numero;

        System.out.printf("Sucessor: %d", valor);
    }
}
