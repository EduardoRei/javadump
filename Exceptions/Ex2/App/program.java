package Exceptions.Ex2.App;

import java.util.Locale;
import java.util.Scanner;

import Exceptions.Ex2.Model.Entidades.Account;
import Exceptions.Ex2.Model.Exceptions.BusinessException;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe os dados da conta: ");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Saldo Inicial: ");
        Double balance = sc.nextDouble();
        System.out.print("Limite de Saque: ");
        Double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double amount = sc.nextDouble();
        
        try{
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        }
        catch(BusinessException e){
            System.out.println("Erro de saque: " + e.getMessage());
        }




        sc.close();
    }
    
}