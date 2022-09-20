package ProfessorJean;

import java.util.Scanner;

public class Alg149
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double valorCompra;
        double valorVenda;

        System.out.println("Nome produto: ");
        String nome = input.nextLine();

        System.out.println("Valor da compra: ");
        valorCompra = input.nextDouble();

        if(valorCompra < 10)
        {
            valorVenda = valorCompra * 1.7;
        }else if (valorCompra < 30)
        {
            valorVenda = valorCompra * 1.5;
        }else valorVenda = valorCompra * 1.3;

        System.out.printf("Produto %s vendido por R$ %.2f,", nome, valorVenda);
    }
}
