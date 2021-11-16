import java.util.Scanner;
class Perimeter
{
    double a;double b;
    Perimeter(double d, double e)
    {
        a=d;
        b=e;
    }
    double Calculate()
    {
        double peri=2*a*b;
        return peri;
    }
    void show()
    {
        System.out.println("length="+a+" breadth="+b);
        double d =Calculate();
        System.out.println("peri="+d);
    }
}
