package ProfessorJean;
import java.util.Scanner;

public class Alg39
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String a = input.next().replace(",",".");
        String b = input.next().replace(",",".");


        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);

        double media = (a1 + b1) / 2;

        System.out.printf("Media: %.2f", media);
    }
}
