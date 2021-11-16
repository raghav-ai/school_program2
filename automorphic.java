/* program to check whether a number is automorphic or not
 * Armstrong Number in Java: A positive number is called armstrong number 
 *if it is equal to t/he sum of cubes of its digits
 *eg:153 is armstrong 
 */
import java.util.Scanner;
class automorphic
{
   public static void main (String args [])
    {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter an integer");
      int n = sc.nextInt();
      int sq = n*n;
      int temp = n ;
      int counter = 0 ;
      while ( n> 0)
      {
           counter++;
           n = n/10;
        } 
      int end = sq%(int)Math.pow(10,counter);
      if ( temp == end)
      {
       System.out.println("it is an automorphic no.");         
    }
    else
    {   
       System.out.println("it is not  an automorphic no."); 
    }
}
}
   //VDT
   // variable               type            use
   //    n                   int             stores the value that is entered by the user
   //    sq                  int             stores the Square of the value of n
   //    temp                int             stores the unchanged value of n
   //    counter             int             acts as a counter and counts the number ofdigits in n
   //    end                 int             stores the remainder of square   