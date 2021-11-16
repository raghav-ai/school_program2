//to check whether a number is circular prime or not
// circular prime is a number which when rotated is still a prime number
//example 131 is circular prime as 131,113,311 are all prime
import java.util.Scanner;
class cirprime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        String s= sc.next();
        int l= s.length();
        int counter=0;
        String w = s;
        cirprime obj =new cirprime();
        while(counter<l)
        {
            boolean b =obj.check(w);
            w="";
            if(b== true)
            {
                counter++;
                for(int i=1;i<s.length();i++)
                {
                    char ch = s.charAt(i);
                    w=w+ch;
                }
                w=w+s.charAt(0);
                s=w;
            }
        }
        System.out.println("number is circular prime");
    }

    boolean check(String s)
    {
        int k= Integer.parseInt(s);
        for(int i=2;i<k/2;i++)
        {
            if(k%i==0)
            {
                System.out.println("the no. is not a circular prime");
                System.exit(0);
            }
        }
        return true;
    }
}
/* Variable Data Table (VDt)
 * Variable Name     Datatype   use
 *      s            String     to store the number
 *      l            int        to store the length of string s
 *      counter      int        number of rotations
 *      b            boolean    truth value of whether the number is prime or not
 *      w            String     stores the next rotated word
 *      i            int        loop variable
 *      ch           char       stores the index position character
*/