package ProfessorJeanEMarcos.ListaSe;

import java.util.Scanner;

public class Alg154
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Placa: ");
        String placa = input.nextLine();

        Character alvo = placa.charAt(placa.length() -1);

       if(alvo.equals('1'))
           System.out.println("Janeiro");
       else if(alvo.equals('2'))
           System.out.println("Fevereiro");
       else if (alvo.equals('3'))
           System.out.println("Marco");
       else System.out.println("Opcao invalida");
    }
}
