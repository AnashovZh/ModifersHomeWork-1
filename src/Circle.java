import java.util.Scanner;

public class Circle {
    private static  double PI=Math.PI;
    private  static  double radius;
    public Circle(double PI,double radius){
        Circle.PI =PI;
        Circle.radius =radius;
    }
    public Circle(){
    }
    public double getPI() {
        return PI;
    }
    public void setPI(double PI) {
        Circle.PI = PI;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Write radius: ");
        double radius;
        radius= scanner.nextDouble();
        Circle.radius = radius;
    }
    public static void circumference(){
        double circumference = (radius * radius) * PI;
        System.out.println("Circumference of circle "+circumference);
    }
    public static void area(){
      double area=2*(radius)*PI;
        System.out.println("Area of circle= "+area);
    }
}
