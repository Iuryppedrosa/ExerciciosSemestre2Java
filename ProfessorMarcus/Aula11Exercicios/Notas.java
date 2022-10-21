package ProfessorJean.ProfessorMarcus.Aula11Exercicios;

import java.util.Scanner;

public class Notas
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

    public static void mostrarNotas(double[] notasExibir)
    {
        for (int i = 0; i < notasExibir.length; i++)
        {
            System.out.printf("Nota %d = %.2f%n", i, notasExibir[i]);
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
        mostrarNotas(notas);
        input.close();
    }
}
