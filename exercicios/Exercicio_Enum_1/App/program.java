package exercicios.Exercicio_Enum_1.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicios.Exercicio_Enum_1.Entidades.ContratoHora;
import exercicios.Exercicio_Enum_1.Entidades.Departamento;
import exercicios.Exercicio_Enum_1.Entidades.Funcionario;
import exercicios.Exercicio_Enum_1.Entidades_enums.nivelFuncionario;


public class program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Insira o nome do departamento: ");
        String departamentoNome = sc.nextLine();
        System.out.println("Insira informações do Funcionário:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nível Profissional: ");
        String nivel = sc.nextLine();
        System.out.print("Salário base: ");
        Double salarioBase = sc.nextDouble();
        
        Funcionario funcionario = new Funcionario(nome, nivelFuncionario.valueOf(nivel), salarioBase, new Departamento(departamentoNome));

        System.out.print("Quantos contratos esse Funcionário tem? ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println("Insira os dados do contrato #"+i);
            System.out.print("Data (DD/MM/AAAA): ");
            Date contratoData = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            Double valorPorHora = sc.nextDouble();
            System.out.println("Horas trabalhadas: ");
            int horas = sc.nextInt();
            ContratoHora contrato = new ContratoHora(contratoData, valorPorHora, horas);
            funcionario.addContrato(contrato);
        }

        System.out.println();
        System.out.print("Insira o mês e o ano para calcular a renda (MM/AAAA): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3)); 
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getName());
        System.out.println("A renda em " + mesEAno + ": foi de " + String.format("%.2f", funcionario.renda(ano, mes)) );

        sc.close();
    }
}
