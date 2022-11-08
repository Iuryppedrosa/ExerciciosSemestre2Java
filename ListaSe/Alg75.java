package ProfessorJeanEMarcos.ListaSe;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Alg75
{
    public static void main(String[] args)
    {
        Locale local = new Locale("pt", "BR");
        Scanner input = new Scanner(System.in);
        System.out.print("Qual seu peso: ");
        double peso = input.nextDouble();

        double pesoOficial = (int)peso * 1000;

        NumberFormat numberFormart = NumberFormat.getNumberInstance(local);

        System.out.println("Peso em gramas: " + numberFormart.format(pesoOficial));

        double engordou = pesoOficial * (1 + 0.12);

        System.out.printf("Vc engordou para "+ numberFormart.format(engordou));
    }
}
