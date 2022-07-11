import java.util.Scanner;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(System.currentTimeMillis());
        int x = r.nextInt(10);
        System.out.println(x);
        int n = sc.nextInt(10)+ 1;
        for(int i = 0; i < 3; i++){
            if (n == x){
                System.out.println("Você acertou, como fez isso?");
                break;
            }
            else{
                System.out.println("Você errou");
                n = sc.nextInt(10);
            }
        }
        sc.close();
    }
}
