package ProfessorJeanEMarcos.OO.Cachorro;

public class Cachorro
{
    private String nome;
    private String cor;
    private String raca;
    private int idade;
    private int peso = 0;
    private boolean acordado = true;

    public Cachorro(String nome, String cor, String raca, int idade)
    {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }

    public String getRaca()
    {
        return raca;
    }

    public void setRaca(String raca)
    {
        this.raca = raca;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getPeso()
    {
        return peso;
    }

    public void setPeso(int peso)
    {
        this.peso = peso;
    }

    public boolean isAcordado()
    {
        return acordado;
    }

    public void setAcordado(boolean acordado)
    {
        this.acordado = acordado;
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
