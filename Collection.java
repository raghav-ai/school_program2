import java.util.Scanner;
class Collection
{
    int arr[];
    int len;
    Collection()
    {
        len=0;
    }

    Collection(int l)
    {
        len=l;
        arr= new int [len];
    }

    void inpar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println();
    }

    Collection common(Collection P)
    {
        int counter=0;
        for(int i=0;i<len;i++)
        {   
            int k=P.arr[i];
            for(int j=0;j<len;j++)
            {
                if(k==this.arr[j])
                    counter++;
            }

        }
        Collection R = new Collection(counter);
        counter=0;
        for(int i=0;i<len;i++)
        {   
            int k=P.arr[i];
            for(int j=0;j<len;j++)
            {
                if(k==this.arr[j])
                {
                    R.arr[counter]=P.arr[i];
                    counter++;
                }
            }
        }
        return R;
    }

    void arrange()
    {
        int min=0;
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    void display()
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                    c++;
                
            }
            if(c==0)
            System.out.println(arr[i]);
            c=0;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        Collection P = new Collection(n);
        P.inpar();
        Collection Q = new Collection(n);
        Q.inpar();
        Q=Q.common(P);
        Q.arrange();
        Q.display();
    }
}

