import java.util.Scanner;
class truncp
{
    boolean left(int n)
    {

        while(n>0)
        {
            boolean b=check(n);
            if(b==false)
                return false;
            n/=10;
        }
        return true;
    }

    boolean right(int n)
    {
        int p=0;int c=0;
        while(n>0)
        {
            p=p+(int)Math.pow(10,c)*(n%10);
            if(check(p)==false)
            return false;
            n=n/10;
            c++;
        }
        return true;
    }

    boolean check(int n)
    {
        if(n==1||n==0)
            return false;

        for (int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        int sum=0;
        int o=0;
        int b=10;
        truncp obj = new truncp();
        while(o<11)
        {
            if(obj.right(b)&&obj.left(b))
            
            {sum=sum+b;o++;
                System.out.println(b);
            }
            b++;
            
        }
        System.out.println(sum);
    }
}