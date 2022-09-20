package ProfessorJean;

import java.util.Scanner;

public class Alg144
{
    public static void main(String[] args)
    {
        double credito;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu saldo medio: ");
        double saldoMedio = input.nextDouble();

        if(saldoMedio < 501)
        {
            credito = 0;
        }
        else
        {
            if(saldoMedio < 1001)
            {
                credito = saldoMedio * 0.3;
            }
            else if(saldoMedio < 3001)
            {
                credito = saldoMedio * 0.4;
            }else credito = saldoMedio * 0.5;
        }
        System.out.println("saldo atual: " + saldoMedio);
        System.out.println("credito: " + credito);
    }
}
