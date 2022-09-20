package ProfessorJean;

import java.util.Scanner;

public class Alg153
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double indice;
        System.out.println("Qual indice: ");
        indice = input.nextDouble();

        if(indice >= 0.5)
            System.out.println("Suspender");
        else System.out.println("Indice aceitavel.");

    }
}
