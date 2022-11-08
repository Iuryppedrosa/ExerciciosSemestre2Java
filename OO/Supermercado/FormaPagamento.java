package ProfessorJeanEMarcos.OO.Supermercado;

import java.util.ArrayList;

public class FormaPagamento
{
    private String descricao;
    private ArrayList<Pedido> pedidos;

    public FormaPagamento()
    {

    }
    public FormaPagamento(String descricao, ArrayList<Pedido> pedidos)
    {
        this.descricao = descricao;
        this.pedidos = pedidos;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public ArrayList<Pedido> getPedidos()
    {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos)
    {
        this.pedidos = pedidos;
    }

}
