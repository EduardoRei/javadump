import java.util.Scanner;
import java.util.Locale;

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, h;
        System.out.println("Insira o seu codigo: ");
        n = sc.nextInt();
        System.out.println("Insira o numero de horas trabalhadas: ");
        h = sc.nextInt();

        double v, salario;
        System.out.println("Insira o valor por hora : ");
        v = sc.nextDouble();
        salario = (h*v);

        System.out.printf("Id = %d%n Salario: %.2f%n", n, salario);




        sc.close();
    }
}
