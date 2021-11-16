import java.util.Scanner;
class sudoku
{
    int arr[][];
    sudoku()
    {
        arr= new int[9][9];
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }

    boolean check(int n,int m, int k)
    {
        for(int i=0;i<9;i++)
        {
            if(arr[i][m]==k&&n!=i)
                return false;
        }
        for(int j=0;j<9;j++)
        {
            if(arr[n][j]==k&&j!=m)
                return false;
        }
        return true;
    }
    boolean checkb(int row[],int col[],int k)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[row[i]][col[j]]==k)
                return false;
            }
            
        }
        return true;
    }
    int backtrack()
    {
        int ar[]={1,2,3,4,5,6,7,8,9};
        outer: for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(arr[i][j]==0)
                {
                    int r=3*(int)(i/3);
                    int c=3*(int)(j/3);
                    int row[]={r,r+1,r+2};
                    int col[]={c,c+1,c+2};
                    for(int k=0;k<9;k++)
                    {
                        if(check(i,j,ar[k])&&checkb(row,col,ar[k]))
                        {arr[i][j]=ar[k]; int p=backtrack();arr[i][j]=0;}
                        else if(k==8)
                        {return 0;} 
                    }
                }
                if(i==8 && j==8 &&arr[i][j]!=0)
                {
                    display();
                    System.exit(0);
                }
            }
        }
        return 1;
    }
    void display()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        if(sc.next().charAt(0)=='1')
        {}
    }
    /*
    0 0 3 9 5 0 0 0 8 0 0 4 0 0 0 5 0 0 1 0 0 0 2 0 7 0 0 0 0 8 0 0 3 0 5 6 6 1 0 7 0 0 4 0 0 0 3 2 0 0 6 0 1 0 4 0 0 0 6 0 2 0 9 0 0 7 0 8 0 0 0 0 5 6 0 1 0 0 3 0 0
     */
    public static void main(String args[])
    {
        sudoku obj= new sudoku();
        System.out.println("enter numbers");
        
        obj.input();
        System.out.println(81);
        int p=obj.backtrack();
    }
}