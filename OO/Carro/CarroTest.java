package ProfessorJeanEMarcos.OO.Carro;

import java.util.Scanner;

public class CarroTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Carro c1 = new Carro("Branco", "BMW", "M3");

        Carro c2 = new Carro();

        c2.cor = "Amaralo";
        c2.marca = "Toyta";
        c2.modelo = "Corolla";
        System.out.println(c2.cor);
        System.out.println(c2.marca);
        System.out.println(c2.modelo);

        c2.ligarCarro();
        c2.virarDireita();
        c2.virarEsquerda();

        System.out.println();

        System.out.println(c1.cor);
        System.out.println(c1.marca);
        System.out.println(c1.modelo);
        c1.ligarCarro();
        c1.virarDireita();
        c1.virarEsquerda();
        c1.acelerar();
    }
}
