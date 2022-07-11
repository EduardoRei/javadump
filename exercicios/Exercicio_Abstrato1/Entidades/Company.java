package exercicios.Exercicio_Abstrato1.Entidades;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;
    
    public Company() {
        super();
    }
    
    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double sum;
        if(numberOfEmployees <=10){
            sum = (anualIncome * 16) / 100;
        }
        else{
            sum = (anualIncome * 14) / 100;
        }
        return sum;
    }
    
}
