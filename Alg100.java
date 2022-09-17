package Jean;

import java.util.Scanner;

public class Alg100
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero de 4 digitos: ");
        int numero = input.nextInt();

        if(numero > 999 && numero < 10000)
        {
            int milhar = numero / 1000;
            int centena = numero / 100;
            if(((milhar % 4) == 0) && ((centena % 4) == 0))
            {
                System.out.println("É divisivel por 4");
            }else System.out.println("Nao é divisivel por 4");
        }else System.out.println("Numero esta fora do padrao");
    }
}
