package ProfessorJeanEMarcos.ListaSe;


import java.util.Scanner;

public class Alg109
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Nome1: ");
        String nome1 = input.next().toUpperCase();

        System.out.println("Nome2: ");
        String nome2 = input.next().toUpperCase();

        char nome1Char = nome1.charAt(0);//
        char nome2Char = nome2.charAt(0);

        if(nome1Char < nome2Char)
        {
            System.out.println(nome1 + "\n" + nome2);
        }else System.out.println(nome2 + "\n" + nome1);
    }
}
