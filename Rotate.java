import java.util.Scanner;
class Rotate
{
    int arr[][];
    int m,n;
    Rotate(int mm, int nn)
    {
        m=mm;n=nn;
        arr= new int[m][n];
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        
    }
    Rotate rot(Rotate a)
    {
        /*for(int i=0,k=n-1;i<m;i++,k--)
        {
            for(int j=0;j<n;j++)
            {
                this.arr[j][k]=a.arr[i][j];
            }
        }*/
        
        int k=0,l=this.n;
        l--;
        for(int i=0;i<a.m;i++)
        {
            for(int j=0;j<a.n;j++)
            {
                if(k==(this.m)-1&&l>0)
                {
                    this.arr[k][l]=a.arr[i][j];
                    k=0;l--;
                }
                else if(l==-1)
                {
                    return this;
                }
                else
                {
                    this.arr[k][l]=a.arr[i][j];
                    k++;
                }
            }
        }
        return this;
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
        int mm=sc.nextInt();
        int nn=sc.nextInt();
        Rotate obj= new Rotate(mm,nn);
        Rotate obj1= new Rotate(nn,mm);
        obj.accept();
        obj1=obj1.rot(obj);
        obj1.display();
    }
}