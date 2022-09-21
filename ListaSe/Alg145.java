package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg145
{
    public static void main(String[] args)
    {
        int dia;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do livro: ");
        String nomeLivro = input.nextLine();

        System.out.print("Digite professor / aluno: ");
        String selecao = input.nextLine().toLowerCase();

        if (selecao.equalsIgnoreCase("professor"))
        {
            dia = 10;
        }
        else if(selecao.equalsIgnoreCase("aluno"))
        {
            dia = 3;
        }else
            dia = 0;

        if(dia == 0)
        {
            System.out.print("Tipo de usuário desconhecido");
        }else
        {
            System.out.printf("Nome do livro: %s%n", nomeLivro);
            System.out.printf("Tipo de usuário: %s%n", selecao);
            System.out.printf("Total de dias: %d%n", dia);
        }
    }
}
