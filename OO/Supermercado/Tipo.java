package ProfessorJeanEMarcos.OO.Supermercado;

import java.util.ArrayList;

public class Tipo
{
    private String descricao;
    private ArrayList<Produto> produto;

    public Tipo()
    {

    }
    public Tipo(String descricao, ArrayList<Produto> produto)
    {
        this.descricao = descricao;
        this.produto = produto;
    }

    public void setProduto(ArrayList<Produto> produto)
    {
        this.produto = produto;
    }

    public ArrayList<Produto> getProduto()
    {
        return produto;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }
}
