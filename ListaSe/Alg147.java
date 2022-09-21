package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg147
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite conforme o índice abaixo.");
        System.out.print("(1) Vegetariano. \n(2) Peixe. \n(3) Frango.\n(4) Carne.\nSua resposta: ");
        int opcao = input.nextInt();
        int calorias = 0;


        switch (opcao)
        {
            case 1:
                calorias += 180;
                break;
            case 2:
                calorias += 230;
                break;
            case 3:
                calorias += 250;
                break;
            case 4:
                calorias += 350;
                break;
        }
        System.out.print("(1) Abacaxi\n(2) Sorvete.\n(3) Suco.\n(4) Refri.\nSua Resposta: ");
        opcao = input.nextInt();

        switch (opcao)
        {
            case 1:
                calorias += 75;
                break;
            case 2:
                calorias += 110;
                break;
            case 3:
                calorias += 170;
                break;
            case 4:
                calorias += 200;
                break;
        }

        System.out.print("(1) Cha\n(2) Laranja.\n(3) Mousse.\n(4) Chocolate.\nSua Resposta: ");
        opcao = input.nextInt();

        switch (opcao)
        {
            case 1:
                calorias += 20;
                break;
            case 2:
                calorias += 70;
                break;
            case 3:
                calorias += 100;
                break;
            case 4:
                calorias += 65;
                break;
        }
        System.out.printf("Total de calorias: %d", calorias);
    }
}
