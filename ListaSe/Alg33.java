package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg33
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:\n");
        int a = input.nextInt();
        System.out.print("Digite seu segundo numero:\n");
        int b = input.nextInt();

        System.out.printf("Seus números sao %d - %d: ", a, b);

        input.close();
    }
}
