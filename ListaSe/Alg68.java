package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg68
{
    public static void main(String[] args)
    {
        int auxiliar = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da varA: ");
        var a = input.nextInt();

        System.out.print("Digite o valor da varB: ");
        var b = input.nextInt();

        auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.printf("A valor de varA é %d e varB é %d.", a, b);
    }
}
