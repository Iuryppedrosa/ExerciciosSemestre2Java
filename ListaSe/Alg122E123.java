package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg122E123
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int base = 0;

        if(a == b || b == c || a == c)
        {
            System.out.println("Podem ser lados de um triangulo.");
            if(a == b)
            {
                base = c;
                System.out.println("Base: " + c);
                System.out.println("Alturas: " + a + " e " + b);
            }else if(b == c)
            {
                base = a;
                System.out.println("Base: " + a);
                System.out.println("Alturas: " + b + " e " + c);
            }else
            {
                base = b;
                System.out.println("Base: " + b);
                System.out.println("Alturas: " + a + " e " + c);
            }
        }
        else
            System.out.println("Nao sao lados de um triagulo");
    }
}
