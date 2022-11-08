package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg110
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Integer n1 = input.nextInt();

        System.out.println("Digite outro numero: ");
        Integer n2 = input.nextInt();

        String n11 = n1.toString();
        String n22 = n2.toString();


        if(n11.equalsIgnoreCase(n22))
            System.out.println("Sao Iguais.");
        else System.out.println("Sao Diferentes");
    }
}
