package entidades;
public class contador {
    private int nc;
    private String name;
    private double saldo;
    public int getNc() {
        return nc;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSaldo() {
        return saldo;
    }
    public void addsaldo(Double q){
        this.saldo += q;
    }
    public void removesaldo(Double q){
        this.saldo -= q + 5.0 ;
    }
    public contador(int nc, String name) {
        this.nc = nc;
        this.name = name;
    }
    public contador(int nc, String name, double depositoinicial) {
        this.nc = nc;
        this.name = name;
        addsaldo(depositoinicial);
    }
   public  String toString(){
       return "Conta  " + getNc() + ", Titular:  " + getName() + ",  Saldo: R$ " +
       String.format("%.2f", getSaldo());

   }



}
