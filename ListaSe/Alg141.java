package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg141
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome1: ");
        String n1 = input.next();

        System.out.print("Digite os pontos: ");
        int p1 = input.nextInt();

        System.out.print("Nome2: ");
        String n2 = input.next();

        System.out.print("Digite os pontos: ");
        int p2 = input.nextInt();

        System.out.print("Nome3: ");
        String n3 = input.next();

        System.out.print("Digite os pontos: ");
        int p3 = input.nextInt();

        int aux = 0;
        String auxN = "";

        if(p1 < p2)
        {
            aux = p1;
            p1 = p2;
            p2 = aux;
            auxN = n1;
            n1 = n2;
            n2 = auxN;
        }
        if(p1 < p3)
        {
            aux = p1;
            p1 = p3;
            p3 = aux;

            auxN = n1;
            n1 = n3;
            n3 = auxN;
        }
        if(p2 < p3)
        {
            aux = p2;
            p2 = p3;
            p3 = aux;

            auxN = n2;
            n2 = n3;
            n3 = auxN;
        }
        System.out.printf("VENCEDOR%10s: %d pontos.%n", n1, p1);

        System.out.printf("SEGUNDO LUGAR%10s: %d pontos.%n", n2, p2);
        System.out.printf("TERCEIRO LUGAR%10s: %d pontos.%n", n3, p3);
    }
}
