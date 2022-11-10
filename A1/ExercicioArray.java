package ProfessorJeanEMarcos.A1;

import java.util.Scanner;

public class ExercicioArray
{
    public static void main(String[] args)
    {
        double numero;
        double soma = 0;
        double media = 0;
        Scanner input = new Scanner(System.in);
        double[] array = new double[5];

        for(int i = 0; i < array.length; i++)
        {
            numero = input.nextDouble();
            array[i] = numero;
        }

        for(int i = 0; i < array.length; i++)
        {
            soma += array[i];
            media = soma / array.length;
        }
        System.out.printf("Media: %.2f%n", media);
        System.out.println("Valores do array que subtraídos da media resultam em positivos: ");

        for(int i = 0; i < array.length; i++)
        {
            if((array[i] - media) > 0) {
                System.out.println(array[i]);
            }
        }
    }
}
