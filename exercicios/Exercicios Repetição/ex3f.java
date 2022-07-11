import java.util.Scanner;
import java.util.Locale;

public class ex3f {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor inteiro");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            Double x = sc.nextDouble();
                if (x<0 || x>10){
                System.out.println("Valor invalido, digite novamente:");
                x = sc.nextDouble();
            }
            Double y = sc.nextDouble();
                if (y<0 || y>10){
                System.out.println("Valor invalido, digite novamente:");
                y = sc.nextDouble();
            }
            Double z = sc.nextDouble();
                if (z<0 || z>10){
                System.out.println("Valor invalido, digite novamente:");
                z = sc.nextDouble();
            }
            Double media = (2*x + 3*y + 5*z) / 10;
            System.out.println(media);
        }

        sc.close();
        
    }
}
