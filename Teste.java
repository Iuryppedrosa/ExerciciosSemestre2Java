package ProfessorJean;
import java.util.Scanner;

public class Teste
    {
        public static void main(String args[])
        {
            int n1;
            int n2;
            int soma;

            Scanner input = new Scanner(System.in);
            n1 = input.nextInt();
            n2 = input.nextInt();

            soma = n1 + n2;

            System.out.println(soma);

            input.close();
        }
    }
