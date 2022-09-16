package ProfessorJean;

public class Alg63
{
    public static void main(String[] args)
    {
        System.out.printf("O valor a receber pelo professor é: %.2f", resultado(50,60,0.15));
    }
    public static double resultado(double horaAula, double aulasDadasMes, double inss)
    {
        double total = horaAula * aulasDadasMes;
        return total * (1 - inss);
    }
}
