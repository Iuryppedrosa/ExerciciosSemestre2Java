package ProfessorJeanEMarcos.OO.Supermercado;

import java.util.ArrayList;

public class Cliente
{
    private String nome;
    private ArrayList<Pedido> pedidos;

    public Cliente()
    {

    }

    public Cliente(String nome, ArrayList<Pedido> pedidos)
    {
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos)
    {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos()
    {
        return pedidos;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}

