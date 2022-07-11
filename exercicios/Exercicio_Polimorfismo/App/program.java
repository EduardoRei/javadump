package exercicios.Exercicio_Polimorfismo.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.Exercicio_Polimorfismo.Entidades.Funcionario;
import exercicios.Exercicio_Polimorfismo.Entidades.OutsourcedEmployee;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Funcionario> list = new ArrayList<>();
        System.out.println("Insiria o numero de funcionarios: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dados do funcionario #"+i);
            System.out.print("Terceirizado (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Horas: ");
            int hours = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valuePerHour = sc.nextDouble();
            if(ch == 'y'){
                System.out.print("Taxa adicional: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else{
                list.add(new Funcionario(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("Pagamentos: ");
        for (Funcionario funcionario : list) {
            System.out.println(funcionario.getName() + " - R$ " + String.format("%.2f", funcionario.payment()));
        }

        sc.close();
    }
}
