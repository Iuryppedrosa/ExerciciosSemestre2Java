//Entrar com quatro números inteiros e imprimir a média ponderada,
// sabendo que os pesos são respectivamente 1, 2, 3, e 4.

package ProfessorJeanEMarcos.ListaSe;
import java.util.Scanner;
public class Alg41
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero1 = input.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = input.nextInt();

        System.out.print("Digite outro numero: ");
        int numero3 = input.nextInt();

        System.out.print("Digite outro numero: ");
        int numero4 = input.nextInt();

        int media = (numero1 + numero2 * 2 + numero3 * 3 + numero4 * 4) / 10;

        System.out.printf("A media ponderada é %d", media);
    }
}
