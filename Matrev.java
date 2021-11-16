import java.util.Scanner;
class Matrev
{
    int arr[][];
    int m,n;
    Matrev(int mm, int nn)
        {
        m=mm;n=nn;
        arr= new int[m][n];
        }
    void fillarray()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter element");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]= sc.nextInt();
                }
            }
        } 
    int reverse(int x)
    {
        int p=0;
        while(x>0)
        {
            p=p*10+(x%10);
            x=x/10;
        }
        return p;
    }
    void revMat(Matrev p)
    {
        for(int i=0;i<this.m;i++)
            {
                for(int j=0;j<this.n;j++)
                {
                    this.arr[i][j]=reverse(p.arr[i][j]);
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
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sizes");
        int h=sc.nextInt();
        int j= sc.nextInt();
        Matrev obj = new Matrev(h,j);
        obj.fillarray();
        //Matrev obj1 = new Matrev(h,j);
        obj.revMat(obj);
        obj.display();
    }
}
    