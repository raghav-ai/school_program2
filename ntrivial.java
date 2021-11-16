import java.util.Scanner;
class ntrivial
{
     public static int findHCF(int num1, int num2) {
       while(num1 != num2) {
        if(num1 > num2) 
            num1 = num1 - num2;
        else
            num2 = num2 - num1;
     }
     return num1;
    }

    public static void main(String args[])
    {
        int c=0;
        for(int i=10;i<100;i++)
        {
            for(int j=i+1;j<100;j++)
            {
                int hcf = findHCF(i, j);
                if(hcf==1)
                c++;
            }
        }
        System.out.println(c);
    }
}