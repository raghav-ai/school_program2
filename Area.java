import java.util.Scanner;
class Area extends Perimeter
{
    double h;
    double area;
    Area(double a,double b, double c)
    {
        super(a,b);
        h=c;
        area=0.0;
    }
    void doarea()
    {
        area=b*h;
    }
    void show()
    {
        
        super.show();
        
        System.out.println("height "+h+ " area="+area);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l,b,h");
        Double z=sc.nextDouble();
        Double x=sc.nextDouble();
        Double c=sc.nextDouble();
        Area obj = new Area(z,x,c);
        obj.doarea();
        obj.show();
    }
    }