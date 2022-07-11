import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os valores de A,B,C de ax² + bx + c = 0");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0){
            double x1, x2;
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("x1 = %.1f%n", x1);
            System.out.printf("x2 = %.1f%n", x2);
        }
        else if (delta == 0){
            double x = -b / (2*a);
            System.out.println("X é igual a" + x);
        }
        else {
            System.out.println("Não existem resultados reais");
        }
        
        sc.close();
    }
}