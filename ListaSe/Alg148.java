package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg148
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("1 - Norte\n2 - Nordeste\n3 - Centro-Oeste\n4 - Sul\nResposta: ");
        int opcao = input.nextInt();

        System.out.print("1 - Ida\n2 - Ida e Volta\nResposta: ");
        int selecao = input.nextInt();

        if (opcao == 1)
        {
            if (selecao == 1)
            {
                System.out.println("R$500,00 de ida.");
            } else
                System.out.println("R$950,00 de ida e volta.");
        } else if (opcao == 2)
        {
            if (selecao == 2) {
                System.out.println("R$ 350,00 ida");
            } else
                System.out.println("R$ 650,00 ida e volta para");
        }
        System.out.println("Opcao invalida no momento");

    }
}
