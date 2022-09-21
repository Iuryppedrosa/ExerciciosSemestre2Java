package ProfessorJean.ListaSe;
import java.util.Scanner;

public class Alg38
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double a = input.nextDouble();

        System.out.printf("A terça parte de %.2f é: %.2f ", a, (a / 3));
    }
}
