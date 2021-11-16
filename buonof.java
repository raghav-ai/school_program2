import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        String w="";
        int h;
        int arr[];
        for(int l=0;l<n;l++)
        {
            String s1=sc.next();
            String s2=sc.nextLine();
            String s=s1+s2;
            h=sc.nextInt();
            arr=new int[8];
            for(int i=0,j=0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(ch!=' '){
                    
                    w=w+ch;
                    arr[j]=Integer.parseInt(w);
                    w="";
                    j++;
                }
            }
            int ar[]={0,0,0,0,0,0,0,0};
            for(int i=0;i<h;i++)
            {
                for(int j=0;j<=5;j++)
                {

                    if(arr[j]==arr[j+2])
                        ar[j+1]=1;
                    else
                        ar[j+1]=0;

                }
                ar[7]=0;
                ar[0]=0;
                for(int k=0;k<8;k++)
                {
                    arr[k]=ar[k]; 
                }
            }
            for(int p=0;p<8;p++)
            {
                System.out.print(arr[p]+" ");
            }
        }

    }
}
 