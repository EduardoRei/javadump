import java.util.Scanner;

public class ex4f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor");
        int n = sc.nextInt();
        int x,y;
        double divisao=0;

        for (int i=0; i<n ; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            if (y == 0){
                System.out.println("Divisão impossivel");
            }
            else{
                divisao = (double) x / y;
                System.out.printf("%.1f%n",divisao);
            }

        }
        


        sc.close();
    }
}
