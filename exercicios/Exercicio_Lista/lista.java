package exercicios.Exercicio_Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mari");
        list.add("Ana");
        list.add("Bob");
        list.add("Carol");
        list.add("Rodolfo");
        list.add("Luan");
        list.add("Lexia");
        list.add("Alex");
        list.add("Joao");
        list.add(2, "Marcia");


        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        list.remove("ana");
        list.remove(4);

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        System.out.println("Posição do bob: " + list.indexOf("Bob"));
        System.out.println("Posição de alguem que não esta na lista: " + list.indexOf("Drake"));
        System.out.println("----------------------");

        //Gera uma nova lista com somente elementos q começam com A
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'D').findFirst().orElse(null);
        System.out.println(name);
        
    }
    
}
