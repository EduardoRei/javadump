import java.util.Scanner;

public class ex6f {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira N: ");
        
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
