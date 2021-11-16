import java.util.Scanner;
class fasci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range");
        int n= sc.nextInt();
        int m=sc.nextInt();
        int arr[]={0,0,0,0,0,0,0,0,0,0};int o=0;
        for(int j=n;j<m;j++)
        {
            for(int l=0;l<10;l++)
                arr[l]=0;
        for(int i=1;i<=3;i++)
        {
            int p=j*i;
            while(p>0)
            {
                int k=p%10;
                
                if(arr[k]==1)
                {
                    
                    o=1;
                }
                else if(k==0)
                {}
                else
                arr[k]++;
                p=p/10;
            }
        }
        for(int l=1;l<10;l++)
        {
            if(arr[l]==0)
            o=1;
        }
        if(o==0)
        System.out.println("IT IS A FASCINATING NO. "+j);
        o=0;
        
    }
}
}