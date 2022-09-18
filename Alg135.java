package ProfessorJean;

import java.util.Scanner;

public class Alg135
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = input.nextInt();

        if(idade < 16)
            System.out.print("Nao eleitor.");
        else if (idade > 65)
            System.out.print("Eleitor facultativo.");
        else System.out.print("Eleitor Obrigatorio.");
    }
}
