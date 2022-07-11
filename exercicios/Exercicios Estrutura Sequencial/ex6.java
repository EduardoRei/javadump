import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, areat, areac, areatrapezio, areaq, arear, pi;
        pi = 3.14159;
        System.out.println("Insira os valores de A B C: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areat = (a * c) / 2;
        areac =  pi * Math.pow(c, 2);
        areatrapezio = ((a + b) * c) / 2;
        areaq = Math.pow(b, 2);
        arear = a * b;

        System.out.printf("Triangulo: %.3f%n Circulo: %.3f%n Trapezio: %.3f%n Quadrado: %.3f%n Retangulo: %.3f%n", areat, areac, areatrapezio, areaq, arear);

        
        sc.close();
    }
}
