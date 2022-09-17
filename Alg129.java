package Jean;

import java.util.Scanner;

public class Alg129
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu salario: ");
        double salario = input.nextDouble();

        if(salario > 2000)
        {
            double desconto = 0.3;
            double total = salario * (1 - desconto);
            System.out.printf("Seu desconto será de 30%% e seu novo valor liquido é %.3f.", total);
        }else if (salario >= 1200 && salario <= 2000)
        {
            double desconto = 0.25;
            double total = salario * (1 - desconto);
            System.out.printf("Seu desconto será de 25%% e seu novo valor liquido é %.3f.", total);

        }else if (salario > 600 && salario <= 1200)
        {
            double desconto = 0.2;
            double total = salario * (1 - desconto);
            System.out.printf("Seu desconto será de 20%% e seu novo valor liquido é %.3f.", total);
        }else
        System.out.printf("Isento de desconto, salario liquido: " + salario);
    }
}
