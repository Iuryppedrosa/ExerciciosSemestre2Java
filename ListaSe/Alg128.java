package ProfessorJeanEMarcos.ListaSe;

import java.util.Locale;
import java.util.Scanner;

public class Alg128
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um verbo: ");
        String verbo = input.nextLine().toLowerCase(Locale.ROOT);


        if(verbo.contains("er"))
        {
            System.out.println("Segunda conjugacao");
        }else if (verbo.contains("ar"))
            System.out.println("Primeira conjugacao");
        else if (verbo.contains("ir"))
        {
            System.out.println("Terceira conjugacao");
        }else
            System.out.println("Nao contem conjugacao");
    }
}
