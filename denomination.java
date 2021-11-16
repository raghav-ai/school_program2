/* Program to find the minimum number of notes recquired to sum the total amount.using 1000,500,100,50,5,1
 * and to print the digits of the number in letter form.
 * and to provide the number of notes required.
*/
import java.util.Scanner;
class denomination
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int p=n;
        String s="";
        while(p>0)
        {
            int c=p%10;
            if(c==0)
                s="ZERO "+s;
            else if(c==1)
                s="ONE "+s;
            else if(c==2)
                s="TWO "+s;
            else if(c==3)
                s="THREE "+s;
            else if(c==4)
                s="FOUR "+s;
            else if(c==5)
                s="FIVE "+s;
            else if(c==6)
                s="SIX "+s;
            else if(c==7)
                s="SEVEN "+s;
            else if(c==8)
                s="EIGHT "+s;
            else
                s="NINE "+s;
            p=p/10;
        }
        System.out.println("    "+s);
        System.out.println("DENOMINATION");

        int arr[]={1000,500,100,50,5,1};
        int c=0;int sum=0;
        int l=n;
        while(n>0)
        {
            int k=n/arr[c];
            System.out.println("                 "+arr[c]+"  x        "+k+"   =    "+arr[c]*k);
            n=n-arr[c]*k;
            sum=sum+k;
            c++;
        }
        System.out.println("TOTAL                        =     "+l);
        System.out.println("TOTAL NUMBER OF NOTES        =     "+sum);
    }
}
        
                
                
                
                
        