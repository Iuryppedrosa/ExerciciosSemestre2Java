package ProfessorJeanEMarcos.ProfessorMarcus.Aula11Exercicios;

import java.util.Scanner;

public class Notas2
{
    public static double mediaCalcular(double[] notasMedia)//notasMedia vira notas do main hora q chama o metodo
    {
        double qtd = 0;
        for (int i = 0; i < notasMedia.length; i++)
        {
            qtd += notasMedia[i];
        }
        double media = qtd / notasMedia.length;

        return media;
    }
    public static void mostrarMedia(double mediaShow)
    {
        System.out.println(mediaShow);
    }

    public static void mostrarNotas(double[] notasExibir, double mediaDiferente)
    {
        for (int i = 0; i < notasExibir.length; i++)
        {
            System.out.printf("Nota %d = %.2f%n", i, notasExibir[i]);
            if(notasExibir[i] < mediaDiferente)
                System.out.println("Abaixo da media\n");
            else System.out.println("Acima da media\n");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[10];

        System.out.println("Entre com 10 notas: ");
        for (int i = 0; i < notas.length; i++)
        {
            notas[i] = input.nextDouble();
        }

        mostrarMedia(mediaCalcular(notas));
        mostrarNotas(notas, mediaCalcular(notas));
        input.close();
    }
}
