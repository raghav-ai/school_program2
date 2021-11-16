import java.util.Scanner;
abstract class Bank
{
    double amount;
    Bank(double a)
    {
        amount=a;
    }
    abstract double getRateOfInterest();
}
class SBI extends Bank
{
    SBI(double d)
    {
        super(d);
    }
    double getRateOfInterest()
    {
        return (double)amount*7/100;
    }
}
class HDFC extends Bank
{
    HDFC(double d)
    {
        super(d);
    }
    double getRateOfInterest()
    {
         return (double)amount*10/100;
    }
}
class ICICI extends Bank
{
    ICICI(double d)
    {
        super(d);
    }
    double getRateOfInterest()
    {
         return (double)amount*12/100;
    }
}
public class test2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for sbi, 2 for hdfc and 3 ICICI");
        int n= sc.nextInt();
        System.out.println("enter amount");
        double d= sc.nextDouble();Bank obj;double b;
        if(n==1)
        {
            obj=new SBI(d);
            b=obj.getRateOfInterest();
        }
        else if(n==2)
        {
            obj=new HDFC(d);
            b=obj.getRateOfInterest();
        }
        else if (n==3)
        {
            obj=new ICICI(d);
            b=obj.getRateOfInterest();
        }
        else
        {
            System.out.println("wrong bank");
            b=0.0;
        }
        System.out.println(b);
    }
}