import java.math.BigInteger;
class totient
{
    public static void main(String args[])
    {
        int sum=1;double max=0.0;int m=1;
        
        for(int i=2;i<=10;i++)
        {
            m=1;
            for(int j=2;j<i;j++)
            {
                if(i%j!=0)
                {
                    m++;
                }
            }
            double d=(double)i/m;
            if(d>max)
            {
                max=d;
                sum=m;
                
            }
            System.out.println(i+"  "+m+" "+d);
        }
        
    }
}