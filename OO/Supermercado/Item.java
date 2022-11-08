package ProfessorJeanEMarcos.OO.Supermercado;

public class Item
{
    private int quantidade;
    private Produto prod;
    private Pedido pedido;

    public Item()
    {

    }
    public Item(int quantidade, Produto prod, Pedido pedido)
    {
        this.quantidade = quantidade;
        this.prod = prod;
        this.pedido = pedido;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public Produto getProd()
    {
        return prod;
    }

    public void setProd(Produto prod)
    {
        this.prod = prod;
    }

    public Pedido getPedido()
    {
        return pedido;
    }

    public void setPedido(Pedido pedido)
    {
        this.pedido = pedido;
    }

}
