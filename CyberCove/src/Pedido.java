public class Pedido {
    private int numeroDoPedido;
    private Data data;
    private Cliente cliente;
    private Carrinho carrinho;
    private boolean statusDoPedido;

    public Pedido(int numeroDoPedido, Data data, Cliente cliente, Carrinho carrinho) {
        this.numeroDoPedido = numeroDoPedido;
        this.data = data;
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.statusDoPedido = false;
    }

    public void PedidoFeito(){
        if(statusDoPedido == false){
            statusDoPedido = true;
            System.out.println("Pedido realizado com sucesso!");
        }else {
            System.out.println("O pedido já foi realizado!");
        }
    }

    public void CancelarPedido(){
        if(statusDoPedido == true){
            statusDoPedido = false;
            System.out.println("Pedido cancelado com sucesso!");
        }else{
            System.out.println("Pedido já está cancelado!");
        }
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public boolean isStatusDoPedido() {
        return statusDoPedido;
    }

    public void setStatusDoPedido(boolean statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }
}
