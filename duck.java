/*A Duck number is a number which has zeroes present in it,
 * but there should be no zero present in the beginning of the number
 */import java .util.Scanner;
class duck
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        String s = sc.next();
        char ch = s.charAt(0);
        if(ch=='0')
        
        {
            System.out.println("not duck no.");
        }
        else
        System.out.println("  duck no.");
    }
}
/* vdt          
 *  variable        type       use
 *  s              String      stores value of element
 *  ch              char       stores the first number


 */            