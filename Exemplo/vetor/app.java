import java.util.Locale;
import java.util.Scanner;

import product.product;

public class app {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        product[] vect = new product[n];

        for(int i=0; i<vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new product(name, price);
        }

        double soma = 0;
        for(int i=0; i<vect.length; i++){
            soma += vect[i].getPrice();
        }
        double media = soma/vect.length;
        System.out.printf("O preço medio é de R$ %.2f%n", media);
        sc.close();
    }   
}
