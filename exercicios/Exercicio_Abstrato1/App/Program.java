package exercicios.Exercicio_Abstrato1.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.Exercicio_Abstrato1.Entidades.Company;
import exercicios.Exercicio_Abstrato1.Entidades.Individual;
import exercicios.Exercicio_Abstrato1.Entidades.TaxPayer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or Company (i/c): ");
            char ch = sc.next().charAt(0);
            if(ch == 'i'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual Income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double he = sc.nextDouble();
                list.add(new Individual(name, anualIncome, he));
            }
            else{
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Anual Income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new Company(name, anualIncome, employees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        double sum = 0;
        for (TaxPayer taxPayer : list) {
            System.out.printf("%s: $ %.2f%n", taxPayer.getName(), taxPayer.tax());
            sum += taxPayer.tax();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum) );
    }
}
