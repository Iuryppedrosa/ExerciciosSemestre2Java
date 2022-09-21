package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg132 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual valor sera convertido: ");
        double reais = input.nextDouble();

        System.out.print("Digite F para suiço, L para libra, D para dolar e M para marco alemao.");
        String conversao = input.next().toUpperCase();

        if (conversao.equalsIgnoreCase("f"))
        {
            System.out.print("Digite o valor do franco suiço: ");
            double franco = input.nextDouble();
            System.out.print("Total de francos: " + reais / franco);
        }

        else if (conversao.equalsIgnoreCase("l"))
        {
            System.out.print("Digite o valor em libras: ");
            double libra = input.nextDouble();
            System.out.print("Total de libras: " + reais / libra);
        }
        else if (conversao.equalsIgnoreCase("d"))
        {
            System.out.print("Digite o valor em um dolar em reais: ");
            double dolar = input.nextDouble();
            System.out.print("Total em dolares: " + reais / dolar);
        }else if (conversao.equalsIgnoreCase("m"))
        {
            System.out.print("Digite o valor de um marco alemao em reais: ");
            double marco = input.nextDouble();
            System.out.print("O valor total em marco alemao é: " + reais / marco);
        }else System.out.print("Moeado desconhecida.");
    }
}