import java.util.Locale;
import java.util.Scanner;

import Entidades.funcionario;

public class app{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        funcionario funcionario = new funcionario();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Salario bruto: ");
        funcionario.sb = sc.nextDouble();
        System.out.print("Impostos: ");
        funcionario.i = sc.nextDouble();
        System.out.println();
        System.out.printf("Funcionario: %s, R$ %.2f%n", funcionario.name ,funcionario.sl());
        System.out.println();
        System.out.println("Insira a porcentagem de aumento do salario: ");
        double a = sc.nextDouble();
        funcionario.aumento(a);

        System.out.println();
        System.out.printf("Novo salario: R$ %.2f%n", funcionario.sl());

        sc.close();
    }
}