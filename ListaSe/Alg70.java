package ProfessorJeanEMarcos.ListaSe;
import java.util.Scanner;
public class Alg70
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Quanto foi a despesa com garçom este mês? ");
        double despesa = input.nextDouble();

        double acrescimo = despesa * (1 + 0.1);

        System.out.printf("A despesa com acréscimo de 10%% do garçom passa a ser: %.2f", acrescimo);
    }
}
