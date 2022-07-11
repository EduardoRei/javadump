import java.util.Locale;
import java.util.Scanner;


public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      

        System.out.println("Insira o valor do raio : ");

        double r, area, pi;
        pi = 3.14159;

        r = sc.nextDouble();

        area = pi * Math.pow(r, 2);

        System.out.printf("A area desse circulo é de: %.4f%n ", area);






        sc.close();
    }
}
