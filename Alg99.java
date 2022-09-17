package Jean;

import java.util.Scanner;

public class Alg99
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero de 3 digitos: ");
        int numero = input.nextInt();

        if(numero > 99 && numero < 1000)
        {
            int centena = numero / 100;

            if (centena % 2 == 0) {
                System.out.println("par");
            } else System.out.println("impar");

        }else System.out.println("Numero nao tem 3 digitos");
    }
}
