package exercicios.Exercicio_de_vetor;

import java.util.Scanner;

import entidades.util;

public class app{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        util[] vect = new util[10];

        System.out.println("Insira o numero de quartos a serem alugados: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println();
            System.out.println("Alugel #" + i + " :");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new util(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for(int i = 0; i<10; i++){
            if (vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}