import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a senha:");

        int senha;

        senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}