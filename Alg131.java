package ProfessorJean;

import java.util.Scanner;

public class Alg131
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine().toUpperCase();

        char nome1 = nome.charAt(0);

        if (nome1 >= 'A' && nome1 <= 'K')
        {
            System.out.println("Sala 101.");
        }else if(nome1 >= 'L' && nome1 <= 'N')
        {
            System.out.println("Sala 102");
        }else if(nome1 >= 'O' && nome1 <= 'Z')
        {
            System.out.println("Sala 103");
        }else System.out.println("Nome invalido");
    }
}
