package Jean;
import java.util.Arrays;
import java.util.Scanner;

public class Alg116A118
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] numeros = new double[3];
        for(int i = 0; i < numeros.length; i ++)
        {
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextDouble();
        }

        Arrays.sort(numeros);

        for(int j = 0; j < numeros.length; j++)
        {
            System.out.println(numeros[j] + " ");
        }

        double maior = Double.MIN_VALUE;

        for(int i = 0; i < numeros.length; i++)
        {
            if(numeros[i] > maior)
            {
                maior = numeros[i];
            }
        }
        System.out.printf("O maior numero é %.1f", maior);
    }
}
