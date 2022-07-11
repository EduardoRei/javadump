import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 3 valores");
    
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        if(x == y && y == z){
            System.out.println("Triangulo Equilatero");
        }
        else if(x == y && y!=z || x == z && x!=y || x != z && z == y){
            System.out.println("Triangulo isosceles");
        }
        else{
            System.out.println("Triangulo Escaleno");
        }
        sc.close();

    }
}