import java.util.*;
class stealth
{
    public static void main(String args[])
    {
        ArrayList<Long> l=new ArrayList<Long>();
        int c=0;

        for(long i=4;i<(long)Math.pow(10,6);i++)
        {

            for(long j=1;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                    l.add(j+(i/j));
            }
            if(l.size()>2)
            {
                outer:for(int j=0;j<l.size()-1;j++)
                {
                    for(int k=j+1;k<l.size();k++)
                    {
                        if(l.get(j)-l.get(k)==1||l.get(j)-l.get(k)==-1)
                        {c++;break outer;}
                    }
                }
            }
            l.clear();
        }
        System.out.println(c);
    }
}

