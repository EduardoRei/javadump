package exercicios.Exercicio_StringBuilder.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import exercicios.Exercicio_StringBuilder.Entidade.Post;
import exercicios.Exercicio_StringBuilder.Entidade.comentario;

public class program{
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        comentario c1 = new comentario("Tenha uma boa Viagem");
        comentario c2 = new comentario("Nossa isso é incrivel");
        Post p1 = new Post(sdf.parse("09/06/2022 14:15:00"), "Viajando pra Nova Zelandia", "Vou visiatr esse pais maravilhoso", 15);
        p1.addComentario(c1);
        p1.addComentario(c2);

        System.out.println(p1);


    }
}