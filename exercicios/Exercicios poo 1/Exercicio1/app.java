import java.util.Locale;
import java.util.Scanner;
import entidades.rectangle;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        rectangle rectangle = new rectangle();

        System.out.println("Enter Rectangle width and height");
        rectangle.w = sc.nextDouble();
        rectangle.h = sc.nextDouble();

        System.out.println(rectangle);
        
        sc.close();
    }
}
