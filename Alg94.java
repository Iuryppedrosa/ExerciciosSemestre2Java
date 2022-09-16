package ProfessorJean;
import java.util.Scanner;

public class Alg94
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        int numero1 = input.nextInt();

        if((numero1 % 3) == 0)
        {
            System.out.println("É múltiplo de 3.");
        }
        else System.out.println("Não é multiplo de 3");
    }
}
