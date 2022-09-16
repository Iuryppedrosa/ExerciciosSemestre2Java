package ProfessorJean;
import java.util.Scanner;
public class Alg74
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o valor do salario minimo? ");
        double salMinimo = input.nextDouble();

        System.out.print("Qual seu salário? ");
        double salario = input.nextDouble();

        double recebido = salario / salMinimo;

        System.out.printf("Vc recebe %.2f de um salários mínimos", recebido);
    }
}
