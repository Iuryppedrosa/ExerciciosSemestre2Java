
package ProfessorJeanEMarcos.ProfessorMarcus.Aula11Exercicios;
import java.util.Random;
public class ExArray1174
{
    public static void main(String[] args)
    {
        Random random = new Random();
        double[] vetor = new double[5];
        int i = 0;

        for(i = 0; i < vetor.length; i++)
        {
            vetor[i] = random.nextDouble(10);
        }

        for(i = 0; i < vetor.length; i++)
        {
            if(vetor[i] <= 5)
            {
                System.out.printf("Vetor[%d] = %.1f%n", i, vetor[i]);
            }
        }
        System.out.println();
        System.out.println();
        for(i = 0; i < vetor.length; i++)
        {
            System.out.printf("(Original) Vetor[%d] = %.1f%n", i, vetor[i]);
        }
    }
}
