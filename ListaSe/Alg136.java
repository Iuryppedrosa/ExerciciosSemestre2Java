package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg136
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = input.nextInt();

        System.out.print("Nome: ");
        String nome = input.next();

        if(idade <= 10)
            System.out.printf("%s pagará R$ 30,00", nome);
        else if (idade <= 29)
            System.out.printf("%s pagará R$ 60,00", nome);
        else System.out.printf("%s pagará R$400,00", nome);
    }
}
