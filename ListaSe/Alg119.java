package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg119
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if( ( x > y && x > z ) && ( y > z ) )
        { //  x > y > z
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
        else if( ( x > y && x > z ) && ( z > y ) )
        { // x > z > y
            System.out.println(x);
            System.out.println(z);
            System.out.println(y);
        }
        else if( ( y > x && y > z ) && ( x > z ) )
        { //y > x > z
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);
        }
        else if( ( y > x && y > z ) && ( z > x ) )
        { // y > z > x
            System.out.println(y);
            System.out.println(z);
            System.out.println(x);
        }
        else if( ( z > x && z > y ) && ( x > y ) )
        { // z > x > y
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);
        }
        else if( ( z > x && z > y ) && ( y > x ) )
        { // z > y > x
            System.out.println(z);
            System.out.println(y);
            System.out.println(x);
        }


        /*Scanner input = new Scanner(System.in);

        Integer[] numeros = new Integer[3];
        for(int i = 0; i < numeros.length; i ++)
        {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextInt();
        }

        Arrays.sort(numeros, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numeros));*/
    }
}
