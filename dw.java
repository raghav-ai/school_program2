import java .util.Scanner;
class dw
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1,2,3 or 0 to break");
        int n;
        double d = 0.0;
        do
        {
             n=sc.nextInt();
            switch(n)
            {
                case 1:
                {
                    System.out.println("enter a number");
                    int p= sc.nextInt();
                    d= Math.sqrt(p);
                    System.out.println(d);
                    break;
                }
                case 2:
                {
                    System.out.println("enter 2 numbers");
                    int p=sc.nextInt();
                    int q=  sc.nextInt();
                    d= Math.max(p,q);
                    System.out.println(d);break;}
                case 3:{
                    System.out.println("enter a number");
                    int p= sc.nextInt();
                    d= Math.cbrt(p);
                    System.out.println(d);
                    break;
                }
                default:
                System.exit(0);
            }
            System.out.println("enter 1,2,3 or 0 to break");
        } while(n!=0);
    }
} 