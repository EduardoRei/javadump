package exercicios.Exercicio_Lista;

public class funcionario {
    private int id;
    private String nome;
    private double salario;
    
    
    public funcionario() {
    }
    public funcionario(int id, String nome, double salario) {
        super();
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double porcentagem){
        salario += (salario * porcentagem / 100);
    }
    
    @Override
    public String toString(){
        return id +", " + nome + ", " + String.format("%.2f", salario);
    }
}
