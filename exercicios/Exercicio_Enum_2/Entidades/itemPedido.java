package exercicios.Exercicio_Enum_2.Entidades;

public class itemPedido {
    private Produto produto;
    private Integer quantidade;
    private Double preço;

    public itemPedido(){
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public itemPedido(Produto produto, Integer quantidade, Double preço) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preço = preço;
    }

    public Double subtotal(){
        return preço*quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreço() {
        return preço;
    }

    @Override
    public String toString() {
        return getProduto().getNome() + ", $"
                + String.format("%.2f", preço)
                +", Quantidade: " + quantidade +
                ", Subtotal: $" + String.format("%.2f", subtotal());
                
            }
    
}
