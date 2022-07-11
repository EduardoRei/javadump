package exercicios.Exercicio_Static;
 
import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a cotação do dollar?");
        double dolar = sc.nextDouble();
        System.out.println("Quantos dolares você quer comprar?");
        double qdolar = sc.nextDouble();
        double pagar = pagar(dolar, qdolar);
        System.out.printf("O valor a pagar é de R$%.2f%n", pagar);

        sc.close();
    }

    public static double pagar(double dolar, double qdolar) {
        return dolar * qdolar + (dolar * qdolar * 6 / 100);
    }
}