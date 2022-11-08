package ProfessorJeanEMarcos.OO.Supermercado;
import java.util.ArrayList;

public class SupermercadoTeste
{

    public static void main(String[] args)
    {
        ArrayList produtos = new ArrayList<>();
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        ArrayList<Tipo> tipos = new ArrayList<>();
        Tipo t1 = new Tipo();

        ArrayList<Item> itens = new ArrayList<>();
        Item i1 = new Item();

        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido ped1 = new Pedido();

        Cliente c1 = new Cliente();

        FormaPagamento f1 = new FormaPagamento();

        f1.setDescricao("Cartao");
        f1.setPedidos(pedidos);


        p2.setNome("Detergente");
        p2.setPreco(2.99F);
        p2.setQuantidade(5);
        p2.setTipo(t1);


        p1.setNome("Sabao OMO");
        p1.setTipo(t1);
        p1.setQuantidade(2);
        p1.setPreco(5.99F);


        t1.setDescricao("Limpeza");
        t1.setProduto(produtos);
        tipos.add(t1);


        produtos.add(p1);
        produtos.add(p2);

        i1.setProd(p1);//sabao omo
        i1.setQuantidade(5);
        i1.setPedido(ped1);//Joao
        itens.add(i1);


        ped1.setCliente(c1);
        ped1.setData("12/09/1996");
        ped1.setItens(itens);
        pedidos.add(ped1);

        c1.setNome("Joao");
        c1.setPedidos(pedidos);

    }
}
