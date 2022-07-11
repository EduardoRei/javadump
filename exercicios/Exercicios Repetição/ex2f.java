import java.util.Scanner;

public class ex2f {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor inteiro: ");
        int n = sc.nextInt();
        int in = 0, out = 0, x = 0;
        for (int i = 0; i < n; i++){
            x = sc.nextInt();
            if (x >= 10 && x<=20){
                in += 1;
            }
            else{
                out += 1;
            }
        }

        System.out.printf("%d In %n %d out",  in, out);

        sc.close();
        
    }
}
