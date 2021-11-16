import java.util.Scanner;
class Composite
{
    int arr[][];
    int m,n;
    Composite(int mm,int nn)
    {
        m=mm;n=nn;
        arr= new int[m][n];
    }
    int isComposite(int p)
    {
        for(int i=2;i<p;i++)
        {
            if(p%i==0)
            return 1;
        }
        return 0;
    }
    void fill()
    {
        int c=3;
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
               if(isComposite(c)==1)
               {
                   arr[i][j]=c;
                   c++;
                }
                else
                {
                    c++;
                    i--;
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sizes");
        int mm=sc.nextInt();
        int nn=sc.nextInt();
        Composite obj = new Composite(mm,nn);
        obj.fill();
        obj.display();
    }
}