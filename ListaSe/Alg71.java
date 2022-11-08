package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg71
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o horário atual: ");
        String horario = input.next().replace(":",".");

        double horarioNovo = Double.parseDouble(horario);
        double minutos = horarioNovo * 60;

        System.out.printf("Até o momento se passaram %.2f minutos.", minutos);
    }
}
