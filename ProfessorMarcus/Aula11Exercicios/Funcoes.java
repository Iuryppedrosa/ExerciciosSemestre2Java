package ProfessorJeanEMarcos.ProfessorMarcus.Aula11Exercicios;
import java.util.Scanner;

public class Funcoes
{

    public void mensagem(String texto)
    {
        System.out.println("\n" + texto);
    }

    public double soma(double soma1, double soma2)
    {
        return soma1 + soma2;
    }

    public void outraMensagem()//nao tem static, tem q ser chamado via instancia
    {
        System.out.println("A vida é bela");
    }

    public static int[] vetor()
    {
        int[] vetorFatorial = new int[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < vetorFatorial.length; i++)
        {
            vetorFatorial[i] = input.nextInt();
        }
        input.close();
        return vetorFatorial;
    }

    public static int fatorial(int n)
    {
        int total = 1;
        for(int i = 1; i <= n; i++)
        {
            total *= i;
        }
        return total;
    }
    public static void mostrarVetor(int[] teste)
    {
        for(int i = 0; i < teste.length; i++)
        {
            System.out.println("posicao " + i + " Fatorial = " + teste[i]);
        }
    }


    //public static void main(String[] args)
    //{
    //    mensagem("Teste aqui");//argumentos
    //}








    //static define escopo do uso do método(funcao ou procedimento java)
    //ou seja, se tem static é metodo da classe, se n, é membro da instancia...
}
