import java.util.Scanner;
class sop
{
    boolean check(int n, int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int p= arr[i];
            int m=n;
            int q=0;
            while(p>0)
            {
                int x=p%10;
                int y= m%10;
                if (x==2)
                {}
                else 
                {
                    if(x!=y)
                    {q=1;break;}
                }
                p=p/10;
                m=m/10;
            }
            if(q==1)
            {}
            else
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("size =4");
        System.out.println("enter no. of condition");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter conditions put 2 for x");
        sop obj = new sop();int c=0;
        for(int i =0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               for(int k=0;k<2;k++)
               {
                   for(int l=0;l<2;l++)
                   {
                       int p= i*1000+j*100+k*10+l;
                       if(obj.check(p,arr))
                       {
                           System.out.print(c+" ");
                       }
                       c++;
                   }
                }
            }
        }
    }
}