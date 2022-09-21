package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg106
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = input.next();

        while (nome != null)
        {
            char primeiraLetra = nome.charAt(0);
            if(primeiraLetra == 'A')
            {
                System.out.println(nome);
            }else System.out.println("Não começa com A.");
            System.out.print("Digite um nome: ");
            nome = input.next();
        }
    }
}
