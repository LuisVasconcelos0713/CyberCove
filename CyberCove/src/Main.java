import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Datas
        Data data1 = new Data(13,7,2004);

        //Endereços
        Endereco saopaulo = new Endereco("São paulo","São paulo","Itapiritinga","Lazer",9020,88991122);
        Endereco riodejaneiro = new Endereco("Rio de janeiro","Rio de janeiro","copacabana","Josias",1530,88991122);

        //Clientes
        Cliente cliente1 = new Cliente("Luis","luis@gmail.com",saopaulo,99933345);
        Cliente cliente2 = new Cliente("Luisa","luisa@gmail.com",riodejaneiro,99933345);
            //ArrayList
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(cliente2);
        listaClientes.add(cliente1);

        //Produtos
        Produtos sabonete = new Produtos("Sabonete",45.00,"Higiene",1,true);
        Produtos shampoo = new Produtos("shampoo",54.00,"Higiene",1,true);

        //Carrinhos
        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionaProduto(sabonete);
        carrinho1.adicionaProduto(sabonete);

        Carrinho carrinho2 = new Carrinho();
        carrinho2.adicionaProduto(sabonete);
        carrinho2.adicionaProduto(shampoo);


        //Pedidos
        Pedido pedido1 = new Pedido(1,data1,cliente1,carrinho1);
        Pedido pedido2 = new Pedido(2,data1,cliente2,carrinho2);
            //ArrayList
        ArrayList<Pedido> listaDePedidos = new ArrayList<>();
        listaDePedidos.add(pedido2);
        listaDePedidos.add(pedido1);

        //Pagamentos
        Pagamento pagamento1 = new Pagamento(200,pedido1,carrinho1);
        pagamento1.efetuarPagamento();

        //Lojas
        Loja CyberCove = new Loja("CyberCove",saopaulo,listaClientes,listaDePedidos);
        CyberCove.InformacoesLoja();

        /*
        pedido1.PedidoFeito();

        carrinho1.adicionaProduto(shampoo);
        carrinho1.adicionaProduto(sabonete);
        carrinho1.removeProduto(sabonete);
        System.out.println(carrinho1.getValorTotal());
        */
        System.out.println(carrinho1.toString());
    }
}