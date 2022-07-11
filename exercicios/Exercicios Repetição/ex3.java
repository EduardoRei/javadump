import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual produto você mais gosta atraves dos códigos:");
        System.out.println("1-Alcool, 2-Gasolina, 3-Diesel, 4-FIM");

        int alcool, gasolina, diesel, tipo;
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo == 1){
                alcool += 1;
            }
            else if (tipo == 2){
                gasolina += 1;
            }
            else if (tipo == 3){
                diesel += 1;
            }
            
            tipo = sc.nextInt();

        }
        
        System.out.printf("Muito obrigado!%n Alcool: %d%n Gasolina: %d%n Diesel: %d%n", alcool, gasolina, diesel);
        sc.close();
    }
    
}
