package ProfessorJean.ListaSe;
import java.util.Scanner;

public class Alg52
{
    public static void main(String[] args)
    {
        //perimetro
        //area
        //diagonal
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o lado do quadrado: ");
        double lado = input.nextDouble();

        double perimetro = lado * 4;
        double area = lado * lado;
        double diagonal = lado * Math.sqrt(2);

        System.out.printf("Perimetro: %.2f%nArea: %.2f%nDiagonal: %.3f", perimetro, area, diagonal);
    }
}
