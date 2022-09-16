package ProfessorJean;
import java.util.Scanner;


public class Alg93
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int numero1 = input.nextInt();

        if(numero1 > 0)
            System.out.println(Math.sqrt(numero1));
        else System.out.println(Math.pow(numero1, 2));
    }
}