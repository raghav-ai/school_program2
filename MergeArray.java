import java.util.Scanner;
class MergeArray
{
    int arr1[];
    int arr2[];
    int arr[];
    int m,n;
    MergeArray(int mm,int nn)
    {
        m=mm;n=nn;
        arr1=new int[m];
        arr2= new int[n];
        arr= new int[m+n];
    }
    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("elements of arr1");
        for(int i=0;i<m;i++)
        {
            arr1[i]= sc.nextInt();
        }
        System.out.println("elements of arr2");
        for(int j=0;j<n;j++)
        {
            arr2[j]= sc.nextInt();
        }
    }
    void merge()
    {
        int i=0;int j=0;int k=0;
        while(k<(m+n))
        {
            if(i!=m&& j!=n&& arr1[i]<=arr2[j])
            {
                arr[k]=arr1[i];i++;
            }
            else if(i!=m&&j!=n&&arr1[i]>arr2[j])
            {
                arr[k]=arr2[j];j++;
            }
            else if(i==m)
            {
                arr[k]=arr2[j];
                j++;
            }
            else if(j==n)
            {
                arr[k]=arr1[i];
                i++;
            }
            k++;
        }
        
    }
    void display()
    {
        System.out.println("merged array");
        for(int i=0;i<(m+n);i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sizes");
        int mm=sc.nextInt();
        int nn=sc.nextInt();
        MergeArray obj= new MergeArray(mm,nn);
        obj.fillarray();
        obj.merge();
        obj.display();
    }
}