package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg35
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Diga seu nome: ");
        String nome = input.nextLine();
        System.out.print("Diga seu endereço: ");
        String endereco = input.nextLine();
        System.out.print("Informe seu telefone: ");
        String telefone = input.nextLine();

        System.out.printf("Nome: %s%nEndereço: %s%nTelefone: %s%n", nome, endereco.trim(), telefone);

    }
}
