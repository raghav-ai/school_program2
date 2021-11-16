import java.math.BigInteger;
class pds
{
    public static void main(String args[])
    {
        int max=0;
        for(int i=1;i<100;i++)
        {
            BigInteger a = new BigInteger("1");
            a= a.multiply(BigInteger.valueOf(i));
            for(int j=1;j<100;j++)
            {
                BigInteger b = a.pow(j);
                String s=b.toString();
                
            }
        }
    }
}