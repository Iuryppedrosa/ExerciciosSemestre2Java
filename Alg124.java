package Jean;

import java.util.Scanner;

public class Alg124
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a + b > c && a + c > b && b + c > a)
        {
            System.out.println("Formam triangulo");
            if(a == b &&  a == c)
            {
                System.out.println("Equilatero");
            }else if(a == b && b == c && c == a)
            {
                System.out.println("Isosceles");
            }else System.out.println("Escaleno");
        }else
            System.out.println("Não forma triangulo");
    }
}
