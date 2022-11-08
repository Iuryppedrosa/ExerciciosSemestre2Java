package ProfessorJeanEMarcos.ListaSe;

public class Alg67
{
    public static void main(String[] args)
    {
        System.out.printf("Prestação: %.2f", resultado(150,20,12));
    }
    public static double resultado(double valor, double taxa, double tempo)
    {
        double prestacao = valor + (valor * (taxa / 100) * tempo);
        return prestacao;
    }
}
