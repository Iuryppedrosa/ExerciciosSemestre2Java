package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg104
{
    public static void main(String[] args)
    {
        String nome;
        int idade = 0;
        String sexo;
        Scanner input = new Scanner(System.in);
        System.out.printf("Diga seu nome: %s%nDiga sua idade: %d%nDiga seu sexo: %s%nA",
                nome = input.next(), idade = input.nextInt(), sexo = input.next());
        if(sexo.equalsIgnoreCase("feminino") && idade < 26)
        {
            System.out.println("Aceita");
        }else System.out.println(nome + " NAO ACEITA");
    }
}
