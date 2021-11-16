import java.util.Scanner;
class bouncy
{
    boolean right(int n)
    {
        int p=n;int k=p%10;int m=k;p/=10;
        while(p>0)
        {
            m=k;
            k=p%10;
            if(k>m)
            return false;
            p/=10;
        }
        return true;
    }
    boolean left(int n)
    {
        int p=n;int k=p%10;int m=k;p/=10;
        while(p>0)
        {
            m=k;
            k=p%10;
            if(k<m)
            return false;
            p/=10;
        }
        return true;
        
    }
    public static void main(String args[])
    {
        int c=0;
        bouncy obj = new bouncy();
        for(int i=101;i<10000000;i++)
        {
            if(obj.right(i)||obj.left(i))
            continue;
            else 
            c++;
            double d = (double)((c*100)/i);
            if(d==90){
            System.out.println(i);break;}
        
    }
    System.out.println("DONE");
}
}