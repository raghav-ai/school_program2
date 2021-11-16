import java.util.*;
class ao
{   
    int arr[][];
    int n;
    int c;
    ao(int nn)
    {
        c=0;
        n=nn;
        arr= new int[n][n];
    }
    void fill()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    boolean check()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                    return false;
            }
        }
        return true;
    }
    int count(int i,int j)
    {
        int p=0;
        if(i!=0)
        {
            if(arr[i-1][j]==1)
            p++;
        }
        if(i!=n-1&&arr[i+1][j]==1)
        p++;
        if(j!=n-1&&arr[i][j+1]==1)
        p++;
        if(j!=0&&arr[i][j-1]==1)
        p++;
        return p;
    }
    void rem(int i,int j)
    {
        if(arr[i][j]==0)
        arr[i][j]=1;
        else if(arr[i][j]==1)
        arr[i][j]=0;
        if(i!=n-1&&arr[i+1][j]==0)
        arr[i+1][j]=1;
        else if(i!=n-1&&arr[i+1][j]==1)
        arr[i+1][j]=0;
        if(i!=0&&arr[i-1][j]==0)
        arr[i-1][j]=1;
        else if(i!=0&&arr[i-1][j]==1)
        arr[i-1][j]=0;
        if(j!=n-1&&arr[i][j+1]==0)
        arr[i][j+1]=1;
        else if(j!=n-1&&arr[i][j+1]==1)
        arr[i][j+1]=0;
        if(j!=0&&arr[i][j-1]==0)
        arr[i][j-1]=1;
        else if(j!=0&&arr[i][j-1]==1)
        arr[i][j-1]=0;
        c++;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int nn= sc.nextInt();
        int max=0;
        ao obj = new ao(nn);int k=0;int l=0;
        obj.fill();
        while (!obj.check())
        {
            for(int i=0;i<obj.n;i++)
            {
                for(int j=0;j<obj.n;j++)
                {
                    int p=obj.count(i,j);
                    if(p>max)
                    {
                        max=p;
                        k=i;
                        l=j;
                    }
                }
            }
            obj.rem(k,l);
            max=0;
            k=0;
            l=0;
        }
        System.out.println(obj.c);
    }
}