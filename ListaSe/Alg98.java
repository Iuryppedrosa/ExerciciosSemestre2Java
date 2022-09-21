package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg98
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual seu salario bruto? ");
        double salBruto = input.nextDouble();

        System.out.print("Qual o valor da parcela sugerida? ");
        double parcela = input.nextDouble();

        double maximo = (salBruto * 30) / 100;

        System.out.println("O limite da sua parcela é " + maximo);

        if(parcela >= maximo)
        {
            System.out.println("Nao pode ser concedido o emprestimo.");
        }else System.out.println("Pode ser concedido");
    }
}
