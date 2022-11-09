package ProfessorJeanEMarcos.OO.Supermercado;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void addItem(Scanner input, ArrayList<Pedido> pedidos)
    {
        System.out.println("Qual quantidade de itens vc deseja adicionar: ");
        int quantidade = input.nextInt();

        Produto produto = new Produto();
        Pedido pedido = new Pedido();
        Item item = new Item(quantidade, produto, pedido);

        pedidos.add(pedido);
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
