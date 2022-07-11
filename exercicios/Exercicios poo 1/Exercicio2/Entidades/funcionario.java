package Entidades;

public class funcionario {
    public String name;
    public double sb;
    public double i;

    public double sl(){
        return sb - i;
    }
    public void aumento(double a){
        sb = sb + (sb*a) / 100;
    }
}
