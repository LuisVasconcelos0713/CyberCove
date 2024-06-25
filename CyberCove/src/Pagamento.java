import java.time.LocalDateTime;

public class Pagamento {
    private double valorPago;
    private double valorTotalDoPedido;
    private LocalDateTime dataPagamento;
    private Pedido pedido;
    private Carrinho carrinho;

    public Pagamento(double valorPago, Pedido pedido, Carrinho carrinho) {
        this.valorPago = valorPago;
        this.pedido = pedido;
        this.carrinho = carrinho;
        valorTotalDoPedido = carrinho.getValorTotal();
    }

    public void efetuarPagamento(){
        if(this.valorPago >= valorTotalDoPedido){
            double valorTotal = carrinho.getValorTotal();
            dataPagamento = LocalDateTime.now();
            double troco = valorPago - valorTotal;
            System.out.println("Pagamento realizado com sucesso!");
            System.out.println("Horario do pagamento: " + dataPagamento);
            System.out.println("Recibo de Pagamento:");
            System.out.println("Valor total do pedido: R$ " + valorTotal);
            System.out.println("Valor pago: R$ " + this.valorPago);
            System.out.println("Troco: R$ " + troco);
            System.out.println("Data do pagamento: " + this.dataPagamento);
            System.out.println("Produtos no carrinho: " + carrinho.listaDeProdutos.get(0).getNome() + " + "+ carrinho.listaDeProdutos.get(1).getNome());
            System.out.println("Pedido: " + this.pedido.getNumeroDoPedido());
        }else{
            System.out.println("Favor realizar o pagamento com o valor necessario.");
        }
    }



}
