package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg103
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = input.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        if(anoNascimento > 0)
        {
            int idade = anoAtual - anoNascimento;
            System.out.println("Sua idade é " + idade);
        }
    }
}
