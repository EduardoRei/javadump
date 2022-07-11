import java.util.Scanner;
import java.util.Locale;

public class ex8{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o seu salario ");

        double s, i, v;

        s = sc.nextDouble();

        if (s <= 2000){
            i = 0.0;
        }
        else if ( s <= 3000 ){
            i = (s - 2000) * 0.08;
        }
        else if ( s <= 4500 ){
            i = ( s - 3000) * 0.18 + 1000 * 0.08;
        }
        else{
            i = (s - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (i == 0){
            System.out.println("Isento");
        }
        else{
            System.out.printf("O valor a ser pago é de R$ %.2f%n", i);
        }

        sc.close();
    }
}
