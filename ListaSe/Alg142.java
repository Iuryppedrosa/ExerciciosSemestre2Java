package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg142
{
    public static void main(String[] args)
    {
        int auxiliar;
        int soma;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os pontos do primeiro jogador: ");
        int p1 = input.nextInt();

        System.out.println("Digite os pontos do segundo jogador: ");
        int p2 = input.nextInt();

        System.out.println("Digite os pontos do terceiro jogador: ");
        int p3 = input.nextInt();

        if(p1 > p2)
        {
            auxiliar = p1;
            p1 = p2;
            p2 = auxiliar;
        }
        if(p1 > p3)
        {
            auxiliar = p1;
            p1 = p3;
            p3 = auxiliar;
        }
        if(p2 > p3)
        {
            auxiliar = p2;
            p2 = p3;
            p3 = auxiliar;
        }
        System.out.printf("p1 = %d%np2 = %d%np3 = %d%n", p1,p2,p3);

        soma = p1 + p2 + p3;

        if(soma > 100)
        {
            System.out.println("Media: " + soma / 3);
        }
        else System.out.println("Equipe desclasificada");


    }
}
