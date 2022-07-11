import java.util.Scanner;

import entidades.aluno;

public class app{
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        aluno aluno = new aluno();

        System.out.print("Insira o nome: ");
        aluno.name = sc.nextLine();
        System.out.println("Insira a primeira nota 0-30: ");
        aluno.a = sc.nextInt();
        System.out.println("Insira a segunda nota 0-35: ");
        aluno.b = sc.nextInt();
        System.out.println("Insira a terceira nota 0-35: ");
        aluno.c = sc.nextInt();

        System.out.println("Nota final = " + aluno.nota());

        if (aluno.nota() >= 60){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
            int faltando =  60 - aluno.nota() ;
            System.out.println("Faltando  " + faltando + "  Pontos");
        }
        
        sc.close();
    }
}