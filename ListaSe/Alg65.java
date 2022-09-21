package ProfessorJean.ListaSe;

public class Alg65
{
    public static void main(String[] args)
    {
        System.out.printf("Volume: %.2f", volume(10,20));
    }
    public static double volume(double raio, double altura)
    {
        return Math.PI * Math.pow(raio,2) * altura;
    }
}
