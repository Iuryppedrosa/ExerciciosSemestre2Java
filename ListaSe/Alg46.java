package ProfessorJean.ListaSe;


import java.util.Scanner;

public class Alg46
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double valor = input.nextDouble();

        double ajuste = valor * (1 + 0.1);// + add desconto e - tira valor

        System.out.printf("O valor com desconto é: %.2f", ajuste);
    }
}
