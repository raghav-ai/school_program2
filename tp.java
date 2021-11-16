import java .util.Scanner;
class tp
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter size");
        int m =sc.nextInt();
        int arr[][]= new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {break;}
                else
                {
                    int t=arr[j][i];
                    arr[j][i]=arr[i][j];
                    arr[i][j]=t;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}