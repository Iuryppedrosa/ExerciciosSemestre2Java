package ProfessorJean.OO;

public class CachorroTest
{
    public static void main(String[] args)
    {
        Cachorro cao1 = new Cachorro("Ademir", "Azul", "Shiuaua", 15);

        System.out.println(cao1.nome);
        System.out.println(cao1.idade);

        System.out.println(cao1.acordado);
        cao1.dormir();



        cao1.andar();
        cao1.comer();
        cao1.latir();
        cao1.correr();
        cao1.rosnar();
    }
}
