package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg133
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double peso;
        System.out.print("Entre com a altura: ");
        double altura = input.nextDouble();

        System.out.print("Qual o sexo: ");
        String sexo = input.next().toLowerCase();

        if(sexo.equalsIgnoreCase("m"))
        {
            peso = 72.7 * altura - 58;
        }else peso = 62.1 * altura - 44.7;

        System.out.printf("Seu peso ideal seria: %.2f", peso);
    }
}
