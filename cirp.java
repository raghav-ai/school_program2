import java.util.Scanner;
class cirp
{
    boolean check(int n)
    {
        
        for(int j=2;j<n;j++)
        {
            if(n%j==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        String s= Integer.toString(n);
        cirp obj = new cirp();
        for(int i=0;i<s.length();i++)
        {
            int j=n%10;
            n=n/10;
            n= j*(int)Math.pow(10,s.length()-1)+n;
            System.out.println(n);
            if(!obj.check(n))
            {
                System.out.println("Not cir prime");
                System.exit(0);
            }
        }
        System.out.println("is cir prime");
    }
}