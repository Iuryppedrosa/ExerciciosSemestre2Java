package ProjetosJeanMarcus.src.Jean;

import java.util.Scanner;

public class Alg115
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double n1 = input.nextInt();

        System.out.print("Digite outro numero: ");
        double n2 = input.nextInt();

        double maior = 0;
        double menor = 0;

        if(n1 > n2)
        {
            maior = n1;
            menor = n2;
        }else if (n1 < n2)
        {
            maior = n2;
            menor = n1;
        }
        System.out.println("Raiz do maior: " + maior + " = " + Math.sqrt(maior));
        System.out.println("Quadrado do menor: " + menor + " = " + Math.pow(menor, 2));
    }
}
