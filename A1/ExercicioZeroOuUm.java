package ProfessorJeanEMarcos.A1;
import java.util.Random;
public class ExercicioZeroOuUm
{
    public static void main(String[] args)
    {
        Random aleatorio = new Random();

        int alice = aleatorio.nextInt(2);
        int beto = aleatorio.nextInt(2);
        int clara = aleatorio.nextInt(2);

        System.out.println(alice);
        System.out.println(beto);
        System.out.println(clara);

        System.out.print("Vencedor: ");

        if((alice == 1 && beto == 0 && clara == 0) || (alice == 0 && beto == 1 && clara == 1))
            System.out.print("A");
        else if((alice == 0 && beto == 1 && clara == 0) || (alice == 1 && beto == 0 && clara == 1))
            System.out.print("B");
        else if((alice == 0 && beto == 0 && clara == 1) || (alice == 1 && beto == 1 && clara == 0))
            System.out.print("C");
        else
        System.out.println("*");
    }
    /*
    import java.util.Scanner;
    public class ExercicioZeroOuUm
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            int alice = input.nextInt();
            int beto = input.nextInt();
            int clara = input.nextInt();

            System.out.print("Vencedor: ");

            if((alice == 1 && beto == 0 && clara == 0) || (alice == 0 && beto == 1 && clara == 1))
                System.out.print("A");
            else if((alice == 0 && beto == 1 && clara == 0) || (alice == 1 && beto == 0 && clara == 1))
                System.out.print("B");
            else if((alice == 0 && beto == 0 && clara == 1) || (alice == 1 && beto == 1 && clara == 0))
                System.out.print("C");
            else
                System.out.println("*");
         }
    }

     */
}
