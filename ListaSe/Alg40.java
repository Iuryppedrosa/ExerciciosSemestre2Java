package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg40
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int c = (a / b);
        int d = (a % b);

        System.out.printf("Dividendo: %d%n", a);
        System.out.printf("Divisor: %d%n", b);
        System.out.printf("Resultado: %d%n", c);
        System.out.printf("Resto: %d", d);
    }
}
