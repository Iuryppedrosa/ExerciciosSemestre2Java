/*

Sabendo-se que a UAL calcula o produto através de somas sucessivas,
criar um al- goritmo que calcule o produto de dois números inteiros lidos.
Suponha que os números lidos sejam positivos e que o
multiplicando seja menor do que o multi- plicador.
*/
package ProfessorJean.ListaFor;
import java.util.Scanner;

public class Alg207
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplicando: ");
        int n1 = input.nextInt();

        System.out.println("Multiplicador: ");
        int n2 = input.nextInt();

        int soma = 0;

        for(int i = 1; i <= n2; i++)
        {
            soma = soma + n1;
        }

        System.out.println("Produto: " + soma);
    }
}
