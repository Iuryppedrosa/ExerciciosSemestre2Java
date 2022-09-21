package ProfessorJean.ListaSe;
import java.util.Scanner;
public class Alg60
{
    public static void main(String[] args)
    {
        double primeiro, razao, an;
        int n = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro termo: ");
        primeiro = input.nextDouble();

        System.out.print("Digite a razao: ");
        razao = input.nextDouble();

        an = primeiro + (n - 1) * razao;

        System.out.printf("Décimo termo PA = %.2f%n%n", an);

        n = 5;

        System.out.print("Digite o primeiro termo: ");
        primeiro = input.nextDouble();

        System.out.print("Digite a razao: ");
        razao = input.nextDouble();

        an = primeiro * Math.pow(razao, (n - 1));


        System.out.printf("Quinto termo PG = %.2f", an);
    }
}
