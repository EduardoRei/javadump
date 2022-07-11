package Exemplo.Heranca.App;

import Exemplo.Heranca.Entidades.Account;
import Exemplo.Heranca.Entidades.BusinessAcount;
import Exemplo.Heranca.Entidades.SavingsAccount;

public class program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAcount bacc = new BusinessAcount(1002,"maria" , 1000.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAcount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);

        // DownCasting: nem sempre da certo

        BusinessAcount acc4 = (BusinessAcount)acc2;
        acc4.loan(100.0);
        if(acc3 instanceof BusinessAcount){
            BusinessAcount acc5 = (BusinessAcount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        }
        
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        acc3.withdraw(200);
        System.out.println(acc3.getBalance());
    }
}
