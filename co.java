import java.util.Scanner;
class co
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[][]= new int [2*n-1][2*n-1];
        int set=0;int k=0;int c=0;
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<2*n-1;i++)
            {
                if((c==1||set==n-1)&&i>=2*n-2-set && set!=0)
                {
                    arr[i][j]=n-k;
                    k--;
                }
                else if(k==set)
                {arr[i][j]=n-k;c=1;}
                else if(k<set&&c==0)
                {arr[i][j]=n-k;k++;}
                
            }
            set++;
            k=0;
            c=0;
        }
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                arr[2*n-2-i][2*n-2-j]=arr[i][j];
            }
        }
            
        for(int j=0;j<2*n-1;j++)
        {
            for(int i=0;i<2*n-1;i++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}

