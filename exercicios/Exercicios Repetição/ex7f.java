import java.util.Scanner;

public class ex7f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo: ");

        int x = sc.nextInt();

        for (int i=1; i<=x; i++){
          int primeiro = i;
          int segundo = i*i;
          int terceriro = i*i*i;
          System.out.printf("%d %d %d%n", primeiro, segundo, terceriro);
        
        }




        sc.close();
    }
}
