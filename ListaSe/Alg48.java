package ProfessorJeanEMarcos.ListaSe;
import java.util.Scanner;

public class Alg48
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo: ");
        double salMin = input.nextDouble();
        double preco100Quilowatts = salMin / 7;
        System.out.printf("O valor padrão de 100 quilowatts em sua região é: %.2f%n%n", preco100Quilowatts);

        System.out.print("Quantos quilowatts vieram gastos em sua conta de energia este mês? ");
        double energiaEmQuilowatts = input.nextDouble();
        double valorEnergiaQuilowatts = energiaEmQuilowatts / 100;

        double valorTotal = valorEnergiaQuilowatts * preco100Quilowatts;
        System.out.printf("Preço da sua energia: %.2f%n", valorTotal);

        double descontoEnergia = valorTotal * (1 - 0.1);
        System.out.printf("O valor com desconto é: %.2f", descontoEnergia);
    }
}
