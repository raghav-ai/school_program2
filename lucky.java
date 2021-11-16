import java.util.Scanner;
class lucky
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        int c=2;int p=0;int k=0;
        do
        {
            k=0;
            p=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=0)
                    p++;
                if(p==c)
                {
                    arr[i]=0;
                    p=0;
                    k++;
                }
            }
            c++;
        }while(k>0);
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            System.out.print(arr[i]+" ");
        }
    }
}