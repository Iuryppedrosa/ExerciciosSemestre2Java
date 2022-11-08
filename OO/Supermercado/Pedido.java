package ProfessorJeanEMarcos.OO.Supermercado;

import java.util.ArrayList;

public class Pedido
{
    private String data;

    private ArrayList<Item> itens;

    private FormaPagamento formapgt;
    private Cliente cliente;
    public Pedido()
    {

    }

    public Pedido(String data, FormaPagamento formapgt, Cliente cliente)
    {
        this.data = data;
        this.formapgt = formapgt;
        this.cliente = cliente;
    }


   

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public FormaPagamento getFormapgt()
    {
        return formapgt;
    }

    public void setFormapgt(FormaPagamento formapgt)
    {
        this.formapgt = formapgt;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
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
