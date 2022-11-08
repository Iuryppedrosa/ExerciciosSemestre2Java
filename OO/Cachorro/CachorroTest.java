package ProfessorJeanEMarcos.OO.Cachorro;

public class CachorroTest
{
    public static void main(String[] args)
    {
        Cachorro cao1 = new Cachorro("Ademir", "Azul", "Shiuaua", 15);

        System.out.println(cao1.getNome());
        System.out.println(cao1.getCor());
        System.out.println(cao1.getRaca());
        System.out.println(cao1.getIdade());

        System.out.println(cao1.isAcordado());
        cao1.dormir();

        cao1.setCor("Amarelo");//alterei a cor
        System.out.println(cao1.getCor());

        cao1.andar();
        cao1.comer();
        cao1.latir();
        cao1.correr();
        cao1.rosnar();
    }
}
