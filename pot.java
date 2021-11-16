import java.util.*;
import java.math.BigInteger;
class pot
{
    public static void main(String args[])
    {
        BigInteger bi = new BigInteger("2");
        int n=7;
        BigInteger c = bi.pow(7);int i=0;
        while(true)
        {
            c= c.multiply(BigInteger.valueOf(2));

            n++;
            String s= c.toString(); 
            if((s.substring(0,3)).equals("123"))
                {i++;System.out.println(n);}
            if((s.substring(0,3)).equals("123")&&i==678910){
                System.out.println(n);
                break;
            }

        }
    }
}