package ProfessorJean;

import java.util.Scanner;

public class Alg143
{
    public static void main(String[] args)
    {
        String p1, p2, p3;
        int n1, n2;


        Scanner input = new Scanner(System.in);
        System.out.print("Digite um palavra: ");
        String palavra = input.next();

        if(palavra.length() % 2 == 0)
        {
            n1 = palavra.length() / 2;
            n2 = n1 -1;

            p1 = String.valueOf(palavra.charAt(n1));
            p2 = String.valueOf(palavra.charAt(n2));

            p3 = p1 + p2;

            if(p3.equalsIgnoreCase("rr") || p3.equalsIgnoreCase("ss"))
            {
                System.out.println("Tem um rr OU ss");
            }else System.out.println("Nao tem um rr OU ss");
        }
        else
        {
            n1 = palavra.length() / 2;
            p1 = String.valueOf(palavra.charAt(n1));

            if(p1.equalsIgnoreCase("a") || p1.equalsIgnoreCase("e") ||
                p1.equalsIgnoreCase("i") || p1.equalsIgnoreCase("o") ||
                p1.equalsIgnoreCase("u"))
            {
                System.out.println("É uma vogal");
            }
            else System.out.println("Nao é uma vogal.");
        }
    }
}
