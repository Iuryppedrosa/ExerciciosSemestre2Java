package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg127
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite primeira nota: ");
        int nota1 = input.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = input.nextInt();

        int media = (nota1 + nota2) / 2;
        System.out.println("Nome: " + nome + "\nNota 01: " + nota1 + "\nNota 02: " + nota2 + "\nMedia: " + media);

        if(media > 7) {
            System.out.println("Aprovado");
        }
        else if (media < 3) {
            System.out.println("Reprovacao");
        }
        else System.out.println("Prova Final Recuperacao");



    }
}
