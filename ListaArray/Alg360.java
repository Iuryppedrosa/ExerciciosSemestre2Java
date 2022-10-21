package ProfessorJean.ListaArray;

import java.util.Scanner;

public class Alg360
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] meses = {1 ,2 ,3, 4, 5, 6, 7,8, 9, 10 ,11 ,12};
        int[] ultimosDias = {20, 19, 20, 20, 20, 20, 21, 22, 22, 21};
        String[] signos = {"Capricionio", "Aquario", "Peixes", "Aires", "Touro", "Cancer",
        "Leao", "Virgem", "Livre", "Escorpiao", "Sagitario"};

        System.out.print("Digite sua data de nascimento no formato ddmm: ");
        int data = input.nextInt();

        while (data != 9999)
        {
            int dia = data / 100;
            int mes = data % 100;

            String signo = "null";
            int indice = mes - 1;
            if(dia <= ultimosDias[indice]) {
                signo = signos[indice];
            }
            else signo = signos[indice +1];

            System.out.println(signo);

            System.out.print("Digite sua data de nascimento no formato ddmm: ");
            data = input.nextInt();
        }
    }
}
