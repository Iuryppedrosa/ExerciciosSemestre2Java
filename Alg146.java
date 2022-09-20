package ProfessorJean;

import java.util.Scanner;

public class Alg146
{
    public static void main(String[] args)
    {
        double percurso, consumo;
        Character tipo;
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o tipo do carro: ");
        tipo = input.next().toUpperCase().charAt(0);

        System.out.print("Qual percurso: ");
        percurso = input.nextDouble();

        if(tipo.equals('C'))
        {
            consumo = percurso / 12;
        }else if(tipo.equals('B'))
        {
            consumo = percurso / 9;
        }else if(tipo.equals('A'))
        {
            consumo = percurso / 8;
        }else
            consumo = 0;

        if(consumo != 0)
        {
            System.out.printf("Consumo: %.2f", consumo);
        }
        else
            System.out.println("Modelo Inexistente.");



    }
}
