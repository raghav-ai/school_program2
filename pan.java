import java.util.*;
class pan
{
    boolean check(int n,int m , int p)
    {
        int arr[]= {0,0,0,0,0,0,0,0,0,0};
        while(n>0)
        {
            int l=n%10;
            if(arr[l]==1)
            return false;
            arr[l]++;
            n/=10;
        }
         while(m>0)
        {
            int l=m%10;       
            if(arr[l]==1)
            return false;
            arr[l]++;
            m/=10;
        }
         while(p>0)
        {
            int l=p%10;
            if(arr[l]==1)
            return false;
            arr[l]++;
            p/=10;
        }
        for(int i=1;i<10;i++)
        {
            
            if(arr[0]>0||arr[i]==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int prod=1;
        boolean b=false;
        int sum=0;
        pan obj = new pan();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for(int i=1;i<10000;i++)
        {
            prod=1;
            for(int j=1;j<10000;j++)
            {
                prod = i*j;
                b = obj.check(i,j,prod);
                if(b==true)
                {   if(lst.size()==0||lst.indexOf(prod)== -1)
                    {
                        sum=sum+prod;
                        lst.add(prod);
                        System.out.println(i+" "+j+" "+prod);
                    }
                    }
                b= false;
            }
        }
        System.out.println("done");
        System.out.println(sum);
    }
}