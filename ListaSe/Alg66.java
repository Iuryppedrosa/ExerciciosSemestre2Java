package ProfessorJeanEMarcos.ListaSe;
import java.util.Scanner;
public class Alg66
{
    public static void main(String[] agrs)
    {
        Scanner input = new Scanner(System.in);

        int kmDirigidos = 0;
        int gastoGasolina = 0;
        int totalKm = 0;
        int litrosTotal = 0;
        double media;

        System.out.print("Quantos KM foram dirigidos nessa viagem (digite -1 para sair): ");
        kmDirigidos = input.nextInt();

        while (kmDirigidos != -1)
        {
            System.out.print("Quantos litros de gasolina foram gastos?");
            gastoGasolina = input.nextInt();

            media = (double) kmDirigidos / gastoGasolina;

            totalKm += kmDirigidos;
            litrosTotal += gastoGasolina;

            System.out.printf("Essa foi o custo de galosina por KM foi %.2f.%n", media);
            System.out.printf("Ate esse ponto foram gastos %d de litros de gasolina.%n", litrosTotal);
            System.out.printf("Ate esse ponto vc rodou %d km.%n", totalKm);

            System.out.print("Quantos KM foram dirigidos nessa viagem(digite -1 para sair): ");
            kmDirigidos = input.nextInt();
        }

        System.out.printf("Foram gastos um total de %d de litros de gasolina.%n", litrosTotal);
        System.out.printf("Um total de %d km foram rodados ate o momento.%n", totalKm);
    }
}
