import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        int x;
        x = sc.nextInt();
        if (x < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Não negativo");
        }

        sc.close();
    }
}