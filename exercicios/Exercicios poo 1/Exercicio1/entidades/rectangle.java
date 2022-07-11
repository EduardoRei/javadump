package entidades;

public class rectangle{
    public double w;
    public double h;

    public double area(){
        return h * w;
    }
    public double perimeter(){
        return 2*(w + h);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(w, 2) + Math.pow(h,2));
    }

    public String toString(){
        return "Area = " + area() + "     Perimeter = " + perimeter() + "     Diagonal = " + diagonal();
    }
}