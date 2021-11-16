import java . util.Scanner ;
class cloth 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter cost");
        double t = sc.nextDouble();
        double discount = 5/100d;
        double discount1 = 25/100d;
        double discount2 = 35/100d;
        double discount3 = 50/100d;
        if(t<=2000)
        {
            System.out.println("total cost is ="+t+",amount to be paid ="+(t) + (-t*discount));
        }
        else 
        {System.out.println("hi");
        }
    }
}
            