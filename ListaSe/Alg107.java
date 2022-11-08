package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg107
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        if(nome.toUpperCase().toLowerCase().contains("jose"))
        {
            System.out.println(nome);
        }else System.out.println("Nao contem Jose.");
    }
}
