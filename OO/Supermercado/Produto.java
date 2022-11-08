package ProfessorJeanEMarcos.OO.Supermercado;

import java.util.ArrayList;

public class Produto
{
    private String nome;
    private float preco;
    private int quantidade;
    private ArrayList<Item> itens;
    private Tipo tipo;

    public Produto()
    {

    }
    public Produto(String nome, float preco, int quantidade, ArrayList<Item> itens, Tipo tipo)
    {
        this.nome = nome;
        this.preco = preco;
        this.itens = itens;
        this.tipo = tipo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public float getPreco()
    {
        return preco;
    }

    public void setPreco(float preco)
    {
        this.preco = preco;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public Tipo getTipo()
    {
        return tipo;
    }

    public void setTipo(Tipo tipo)
    {
        this.tipo = tipo;
    }

    public ArrayList<Item> getItens()
    {
        return itens;
    }

    public void setItens(ArrayList<Item> itens)
    {
        this.itens = itens;
    }
}
