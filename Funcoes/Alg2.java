package ProfessorJean.Funcoes;

import java.util.Scanner;

public class Alg2
{
    public static void main(String[] args)
    {
        definirNome();
        System.out.println(modificarNome());
    }

    public static void definirNome()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual seu nome: ");
        String nome = input.next();
        System.out.println(nome);
    }

    public static String modificarNome()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu novo nome: ");
        String nome = input.next();
        return nome;
    }
}
