import java.util.Scanner;
class cot
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]= new int[2*n-1][2*n-1];
        int k=2*n-2;int p=0;
        for(int x=n;x>0;x--)
        {
            for(int i=0;i<2*n-1;i++)
            {   
                for(int j=0;j<2*n-1;j++)
                {
                    if(((i==p||i==k)||(j==p||j==k))&&arr[i][j]==0)
                    {
                        arr[i][j]=x;

                    }
                }

            }
            k--;
            p++;
        }
        for(int i=0;i<2*n-1;i++)
        {   
            for(int j=0;j<2*n-1;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}