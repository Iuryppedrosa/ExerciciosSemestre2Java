package ProfessorJean.ListaFor;

import java.util.Scanner;

public class Alg190
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
        {
            System.out.print("sexo: ");
            String sexo = input.nextLine().toUpperCase();
            Character nomeTeste = sexo.charAt(0);

            if(nomeTeste.equals('F'))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
