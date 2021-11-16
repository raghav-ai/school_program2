//program to convert decimal integer into binary form
import java . util.Scanner ;
class binary
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a no. ");
        int n = sc . nextInt();
        System.out.println(" binary form  below");
        int k =0;
        while (n>0)
         {
              k = n%2;
             int p =0 ;
                System.out.print(p);
               
             n = n/2;
            }
            while (k>0)
            {
                int p = k%10;
                System.out.print(p);
                k=k/10;
            }
        }
    }
// vdt
//    variable    type       use
//       n        int        to store the decimal integer literal entered by the literal
//        k       int        to store the remainder  of k/2        
//


//answers
//  9
//1001

//76
//1001100