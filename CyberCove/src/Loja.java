import java.util.ArrayList;

public class Loja {
    private String nomeLoja;
    private Endereco endereco;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Loja(String nomeLoja, Endereco endereco, ArrayList<Cliente> clientes, ArrayList<Pedido> pedidos) {
        this.nomeLoja = nomeLoja;
        this.endereco = endereco;
        this.clientes = clientes;
        this.pedidos = pedidos;
    }


    public void InformacoesLoja() {
        System.out.println("Informacoes da Loja: " +
                "Nome: " + this.nomeLoja +
                ", Cidade situada: " + this.endereco.getCidade() +
                ", Alguns de nossos principais Clientes: " + this.clientes.get(0).getNome() + " e " + this.clientes.get(1).getNome());
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
