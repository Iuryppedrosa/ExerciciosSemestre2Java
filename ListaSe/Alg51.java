package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg51
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o raio do circulo? ");
        double raio = input.nextDouble();

        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Perimetro: %.2f%nArea: %.2f", perimetro, area);
    }
}
