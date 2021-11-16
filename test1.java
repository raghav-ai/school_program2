import java.util.Scanner;
abstract class Figure
{
    double d1;double d2;
    Figure(double a, double b)
    {
        d1=a;
        d2=b;
    }
    abstract double area();
}
class Rectangle extends Figure
{
    Rectangle(double d,double e)
    {
        super(d,e);
    }
    double area()
    {
        double area=d1*d2;
        return area;
    }
}
class Triangle extends Figure
{
    Triangle(double d,double e)
    {
        super(d,e);
    }
    double area()
    {
        double area=d1*d2/2;
        return area;
    }
}
public class test1
{
    public static void main(String args[])
    {
        Figure obj;
        Rectangle r = new Rectangle(10.5,4.5);
        obj = r;
        System.out.println("Reactangle = "+obj.area());
        Triangle t = new Triangle(6.6,9.8);
        obj=t;
        System.out.println("triangle = "+obj.area());
    }
}