import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o codigo e a quantidade do produto: ");

        int c, q;
        c = sc.nextInt();
        q = sc.nextInt();
        double total;
       
        if (c == 1){
            total = q * 4;
        }
        else if (c == 2){
            total = q * 4.5;
        }
        else if (c == 3){
            total = q * 5;
        }       
        else if (c == 4){
            total = q * 2;
        }
        else {
            total = q * 1.5;
        }
        System.out.println("Total: R$ " + total);
        sc.close();
    }
}
