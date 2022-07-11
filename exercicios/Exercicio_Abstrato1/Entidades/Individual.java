package exercicios.Exercicio_Abstrato1.Entidades;

public class Individual extends TaxPayer {
    private Double healthExpenditures;
    
    public Individual() {
        super();
    }
    
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public double tax() {
        double sum;
        if(anualIncome < 20000.00){
            sum = ((anualIncome * 15) / 100) - ((healthExpenditures * 50) / 100);
        }
        else{
            sum = ((anualIncome * 25) / 100) - ((healthExpenditures * 50) / 100);
        }
        return sum;
    }
    
}
