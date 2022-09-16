package ProfessorJean;
import java.util.Scanner;

public class Alg98
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual seu salário: ");
        double salario = input.nextDouble();

        System.out.println("Qual valor da prestação? ");
        double prestacao = input.nextDouble();

        double limite = (salario * 30) / 100;

        if(prestacao <= limite)
        {
            System.out.println("Limite concedido.");
        }
        else System.out.println("Valor excedido");

    }
}
