package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg152
{
    public static void main(String[] args)
    {
        int idade;
        double peso, gotas;

        Scanner input = new Scanner(System.in);
        System.out.println("Peso: ");
        peso = input.nextDouble();

        System.out.println("Idade: ");
        idade = input.nextInt();

        gotas = 500 / 20;

        if(peso < 5)
            System.out.println("Nao pode tomar");
        else if(idade >= 12)
        {
            if(peso >=60)
            {
                System.out.println("Tomar: " + 1000 / gotas);
            }else System.out.println("Tomar: " + 875 / gotas);
        }else System.out.println("Outras opcoes");


    }
}
