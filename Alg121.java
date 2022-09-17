package Jean;

import java.util.Scanner;

public class Alg121
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int maior = 0;

        if(a > b && a > c && a > d && a > e)
        {
            maior = a;
            System.out.println(maior);
        }else if (b > a && b > c && b > d && b > e)
        {
            maior = b;
            System.out.println(maior);
        }else if (c > a && c > b && c > d && c > e)
        {
            maior = c;
            System.out.println(maior);
        }else if (d > a && d > b && d > c && d > e)
        {
            maior = d;
            System.out.println(maior);
        }else System.out.println(e);
    }
}
