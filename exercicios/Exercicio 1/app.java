import java.util.Locale;
import java.util.Scanner;

import entidades.contador;

public class app{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        contador contador;

        System.out.print("Insira o numero da conta: ");
        int nc = sc.nextInt();
        System.out.print("Insira o nome do titular: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Tem um deposito inicial (y/n)?");
        char d = sc.next().charAt(0);
        if (d == 'y'){
            System.out.print("Insira o deposito inicial: ");
            double depositoinicial = sc.nextDouble();
             contador = new contador(nc, name, depositoinicial);
        }
        else{
            contador = new contador(nc, name);
        }
        System.out.println("Account data: " + contador);
        System.out.println();
        System.out.print("Insira um valor de deposito: ");
        double deposito = sc.nextDouble();
        contador.addsaldo(deposito);
        System.out.println("Updated account data: " + contador);
        System.out.println();

        System.out.print("Insira um valor de saque: ");
        double saque = sc.nextDouble();
        contador.removesaldo(saque);
        System.out.println("Updated account data: " + contador);

        sc.close();
    }
}