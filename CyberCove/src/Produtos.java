public class Produtos {
    private String nome;
    private double preco;
    private String categoria;
    private int codigo;
    private boolean onstock;

    public Produtos(String nome, double preco, String categoria, int codigo, boolean onstock) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.codigo = codigo;
        this.onstock = onstock;
    }

    public String exibirDetalhes() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                ", codigo=" + codigo +
                ", onstock=" + onstock +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isOnstock() {
        return onstock;
    }

    public void setOnstock(boolean onstock) {
        this.onstock = onstock;
    }
}
