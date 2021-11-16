import java.util.*;
import java.math.BigInteger;
class nmp
{
    public static void main(String args[])
    {
        BigInteger bi = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger c = b.pow(7830457);
        bi= bi.multiply(BigInteger.valueOf(28433));
        bi=bi.multiply(c);
        bi=bi.add(BigInteger.valueOf(1));
       String s= bi.toString();
       s=s.substring(s.length()-10);
       System.out.println(s);
    }
}