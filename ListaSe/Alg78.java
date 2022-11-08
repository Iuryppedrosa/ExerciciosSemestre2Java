package ProfessorJeanEMarcos.ListaSe;
import java.util.Scanner;
public class Alg78
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Lados: ");
        int lados = input.nextInt();

        int diagonaisDiferentes = lados * (lados - 3) / 2;

        System.out.printf("Número de diagonais: %d", diagonaisDiferentes);
    }
}
