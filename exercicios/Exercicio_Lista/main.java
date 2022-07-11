package exercicios.Exercicio_Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<funcionario> list = new ArrayList<>();
        System.out.println("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
				System.out.println("ID ja usado! Tente novamente!: ");
				id = sc.nextInt();
			}
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            funcionario funcionario = new funcionario(id , nome, salario);

            list.add(funcionario);
        }
        System.out.println("Insira o id do funcionario que tera o aumento: ");
        int idfuncionario = sc.nextInt();
        funcionario funcionario = list.stream().filter(X -> X.getId() == idfuncionario).findFirst().orElse(null);
        if(funcionario == null){
            System.out.println("Esse id não existe!");
        }
        else{
            System.out.println("Insira a % do aumento");
            double porcentagem = sc.nextDouble();
            funcionario.aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de Funcionarios: ");
        for (funcionario funcionario2 : list) {
            System.out.println(funcionario2.toString());
        }

        sc.close();
    }
    public static boolean hasId(List<funcionario> list, int id) {
		funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
