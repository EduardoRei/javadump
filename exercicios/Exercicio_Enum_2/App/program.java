package exercicios.Exercicio_Enum_2.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicios.Exercicio_Enum_2.Entidades.Cliente;
import exercicios.Exercicio_Enum_2.Entidades.Pedido;
import exercicios.Exercicio_Enum_2.Entidades.Produto;
import exercicios.Exercicio_Enum_2.Entidades.StatusPedido;
import exercicios.Exercicio_Enum_2.Entidades.itemPedido;

public class program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.println("Data de nascimento: (DD/MM/YYYY)");
        Date nascimento = sdf.parse(sc.next());

        Cliente cliente = new Cliente(nome, email, nascimento);
        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(sc.next());
        Pedido pedido = new Pedido(new Date(), status, cliente);
        System.out.println("Quantos itens tera nesse pedido? ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Insira os dados do produto #" + (i+1));
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.println("Preço do produto: ");
            double preço = sc.nextDouble();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            Produto produto = new Produto(nomeProduto, preço);
            itemPedido ip = new itemPedido(produto, quantidade, preço);
            pedido.addItem(ip);
        }
        System.out.println(pedido);

        sc.close();
    }
}
