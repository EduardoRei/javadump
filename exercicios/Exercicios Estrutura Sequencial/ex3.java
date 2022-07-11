import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira A B C D:");

        int a, b, c, d, diferenca;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a*b - c*d);

        System.out.println("A diferença é: " + diferenca);

        sc.close();

    }
    
}
