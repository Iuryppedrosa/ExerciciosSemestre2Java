package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg34
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a = input.nextInt();

        System.out.printf("O sucessor de %d é %d.%n", a, (a + 1));
        System.out.printf("O antecessor de %d é %d.", a, (a - 1));
    }
}
