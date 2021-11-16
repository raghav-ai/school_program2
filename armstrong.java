// program to check whether th no. is an armstrong number or not
//   automorphic number is a number whose square "ends" in the same digits as 
// the number itself
// eg 5 is automorphic as 5^2=25
import java.util.Scanner;
class armstrong
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no.");
        int n = sc . nextInt();int temp = n;
        int t = 0;int p =0;
        while (n>0)
        {
            t= n%10;//extracting the digits of the number 
            p = p +(int)Math.pow(t,3);//  ading the extracted numbers raised to the power three
            n =n/10;    // removing that number from the original number
        }
        if (p==temp)
         System.out.println("armstrong");
         else
          System.out.println("not armstrong");
        }
    }
   //  vdt
   // variable        type          use
   //    n            int           stores the value entered by the user that needs to be checked whether the number is armstrong or not
   //    temp         int           stores the value of n
   //    t            int           stores the extracted digits
   //    p            int           the value of variable t is raised to the power 3 and is added to variable p     