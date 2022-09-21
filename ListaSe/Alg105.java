package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg105
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sigla do seu estado: ");
        String estado = input.next();

        if(estado.equalsIgnoreCase("rj"))
        {
            System.out.println("Rio de Janeiro");
        }else if(estado.equalsIgnoreCase("sp"))
        {
            System.out.println("Sao Paulo");
        }else if(estado.equalsIgnoreCase("mg"))
        {
            System.out.println("Minas Gerais");
        }else System.out.println("Outro Estado");
    }
}
