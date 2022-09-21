package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg130
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual valor da compra: ");
        double compra = input.nextDouble();

        if(compra < 20)
        {
            double venda = 0.45;
            System.out.println("Venda = " + compra * (1 + venda));
        }else
            System.out.println("Venda = " + compra * (1 + 0.3));
    }
}
