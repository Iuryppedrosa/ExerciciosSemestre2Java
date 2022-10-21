package ProfessorJean.OO;

public class Carro
{
    public String cor;
    public String marca;
    public String modelo;

    public Carro(String cor, String marca, String modelo)//construtor
    {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro()
    {

    }

    public void ligarCarro()
    {
        System.out.println("Carro ligado");
    }

    public void virarDireita()
    {
        System.out.println("Virando a direita");
    }

    public void virarEsquerda()
    {
        System.out.println("Virando a esquerda");
    }

    public void acelerar()
    {
        System.out.println("Acelerando");
    }
}
