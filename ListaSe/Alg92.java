package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg92
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        double numero1 = input.nextDouble();

        System.out.print("Entre com outro numero: ");
        double numero2 = input.nextDouble();

        double resultado = numero1 + numero2;

        if(resultado > 20)
        {
            System.out.println(resultado + 8);
        }else if (resultado <= 20)
            System.out.println(resultado - 5);

    }
}
