package ProfessorJean;

import java.util.Scanner;

public class Alg56
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.next();

        System.out.print("Sua idade: ");
        String idade = input.next();

        System.out.print(nome + "\n" + idade);

    }
}
