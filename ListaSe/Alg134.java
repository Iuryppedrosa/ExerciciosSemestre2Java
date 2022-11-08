package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg134
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = input.nextInt();


        if(idade < 5)
        {
            System.out.print("Nao tem categoria.");
        }else if (idade <= 17)
            System.out.println("B");
        else System.out.print("Senior.");
    }
}
