package exercicios.Exercicio_Enum_2.Entidades;

public class Produto {
    private String nomeProduto;
    private double preço;

    public Produto() {
    }

    public Produto(String nome, double preço) {
        this.nomeProduto = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nomeProduto;
    }
    public void setNome(String nome) {
        this.nomeProduto = nome;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }

    
}
