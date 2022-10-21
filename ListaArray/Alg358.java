package ProfessorJean.ListaArray;

import java.util.Scanner;

public class Alg358
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double [] precoCompra = new double[3];
        double [] precoVende = new double[3];
        double lucro;
        int lucroMenor10 = 0;
        int lucroMenor20 = 0;
        int lucroMaior20 = 0;
        int cont;

        for(cont = 0; cont < precoCompra.length; cont++)
        {
            System.out.print("Preco de compra: ");
            precoCompra[cont] = input.nextDouble();
            System.out.printf("Preco de venda: ");
            precoVende[cont] = input.nextDouble();
        }
        for(cont = 0; cont < precoCompra.length; cont++)
        {
            lucro = precoVende[cont] - precoCompra[cont];

            if(lucro < 10)
                lucroMenor10++;
            else if (lucro <= 20)
                lucroMenor20++;
            else lucroMaior20++;
        }

        System.out.printf("Total de mercadorias com lucro < 10%%: %d%n", lucroMenor10);
        System.out.printf("Total de mercadorias com lucro < 10%% e <= 20%%: %d%n", lucroMenor20);
        System.out.printf("Total de mercadorias com lucro > 20%%: %d%n", lucroMaior20);






    }
}
