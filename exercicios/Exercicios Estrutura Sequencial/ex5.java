import java.util.Scanner;
import java.util.Locale;


public class ex5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o codigo da peça, o numero de peças, e o valor unitario");
        int c1, q1, c2, q2;
        double p1, p2, total;
        c1 = sc.nextInt();
        q1= sc.nextInt();
        p1 = sc.nextDouble();
        System.out.println("Insira o codigo da peça, o numero de peças, e o valor unitario");
        c2 = sc.nextInt();
        q2 = sc.nextInt();
        p2 = sc.nextDouble();

        total = q1 * p1 + q2 * p2;

        System.out.printf("O Valor a pagar é %.2f%n", total);




        sc.close();
    }
}
