package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg93
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        double numero1 = input.nextDouble();

        if (numero1 > 0)
        {
            numero1 = Math.sqrt(numero1);
        }else if (numero1 < 0)
        {
            numero1 = Math.pow(numero1, 2);
        }
        System.out.println(numero1);
    }
}
