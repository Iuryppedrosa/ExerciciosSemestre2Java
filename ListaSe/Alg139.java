package ProfessorJean.ListaSe;

import java.util.Scanner;

public class Alg139
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Municipio: ");
        String nomeMunicipio = input.next();

        System.out.println("Eleitores aptos: ");
        int eleitoresAptos = input.nextInt();

        System.out.println("Votos Candidado mais votado: ");
        int votos = input.nextInt();

        if(eleitoresAptos > 20000 && votos <= (eleitoresAptos / 2))
        {
            System.out.printf("%s tera segundo turno.", nomeMunicipio);
        } else System.out.printf("%s nao tera segundo turno.", nomeMunicipio);

    }
}
