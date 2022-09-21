package ProfessorJean.ListaSe;
import java.util.Scanner;
public class Alg73
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero real: ");
        double n = input.nextDouble();

        int valor = (int) n;

        System.out.printf("Parte inteira: %d%n", valor);

        valor = (int)Math.round((n - (int)n) * 100);

        System.out.printf("A parte decimal: %d%n", valor);

        System.out.printf("O numero arredondado: %.2f", Math.ceil(n));
    }
}
