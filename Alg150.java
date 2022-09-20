package ProfessorJean;

import java.util.Scanner;

public class Alg150
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Angulo em graus: ");
        double angulo = input.nextDouble();

        double resultado = angulo * Math.PI / 180;

        if((resultado > Math.PI / 2) && (resultado <= Math.PI) || ((resultado > 3 * Math.PI / 2) && (resultado <= 2 * Math.PI)))
        {
            System.out.println("Seno: " + Math.sin(resultado));
        }
        System.out.println("Cosseno: " + Math.cos(resultado));
    }
}
