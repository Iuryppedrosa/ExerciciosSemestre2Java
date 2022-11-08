package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg126
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero: ");
        int a = input.nextInt();

        if(a == 5 || a == 200 || a == 400)
            System.out.println("Primeiro escopo");
        else if(a > 500 && a < 1000)
        {
            System.out.println("Segundos escopo");
        }else System.out.println("Fora de escopo");


    }
}
