package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg57
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println(media);
        System.out.printf("%.2f", media);
    }
}
