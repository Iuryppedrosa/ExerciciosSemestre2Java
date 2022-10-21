package ProfessorJean.OO;

import org.w3c.dom.ls.LSOutput;

public class Cachorro
{
    public String nome;
    private String cor;
    private String raca;
    public int idade;
    private int peso = 0;
    public boolean acordado = true;

    public Cachorro(String nome, String cor, String raca, int idade)
    {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir()
    {
        System.out.println("Au Au Auu");
    }

    public void comer()
    {
        peso++;
        System.out.println(peso);
    }

    public void dormir()
    {
        boolean estado = !acordado;
        System.out.println(estado);
    }

    public void rosnar()
    {
        System.out.println("Rosando");
    }

    public void andar()
    {
        System.out.println("Andando");
    }

    public void correr()
    {
        System.out.println("Correndo");

    }
}
