package ProfessorJeanEMarcos.ListaArray;

import java.util.Scanner;

public class Alg354
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero;

        int[] num = new int[5];

        for(int i = 0; i < num.length; i++)
        {
            System.out.println("Numero: ");
            num[i] = input.nextInt();

            if(num[i] % 2 == 0)
                System.out.println("Par");
            else System.out.println("Impar");
        }
    }
}
