import java.util.ArrayList;

public class Carrinho {
    ArrayList<Produtos> listaDeProdutos = new ArrayList<Produtos>();
    private double valorTotal;

    public void adicionaProduto(Produtos produto){
        if(listaDeProdutos.size() <= 9){
            listaDeProdutos.add(produto);
            valorTotal += produto.getPreco();
            System.out.println("Produto " + produto.getNome() + " Adicionado com sucesso!");
        }else{
            System.out.println("Carrinho está cheio!");
        }
    }

    public void removeProduto(Produtos produto){
        if(listaDeProdutos.contains(produto)){
            listaDeProdutos.remove(produto);
            valorTotal -= produto.getPreco();
            System.out.println("Produto " + produto.getNome() + " Foi removido com sucesso");
        }else {
            System.out.println("Produto não está no carrinho!");
        }
    }

    @Override
    public String toString() {
        return "Quantidade de produtos no carrinho: " + listaDeProdutos.size();
    }

    public ArrayList<Produtos> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
