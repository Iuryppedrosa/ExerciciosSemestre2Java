package ProfessorJeanEMarcos.ListaSe;
import java.util.Scanner;
public class Alg72
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o valor vc tem depositado? ");
        double valor = input.nextDouble();

        double totalComRendimento = valor * (1 + 0.0214);
        double redimento = totalComRendimento - valor;

        System.out.printf("O seu valor com redimentos é %.2f.%nO seu rendimento foi de %.2f.", totalComRendimento, redimento);
    }
}
