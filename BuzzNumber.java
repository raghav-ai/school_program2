//to check whether a number is a buzz number or not
import java.util.Scanner ;
class BuzzNumber
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" enter a number");
        int n = sc.nextInt();
       
        if (n%10 ==7)
        {
            System.out.println(n+" is a BUZZ number");
        }
        else if (n%7==0)
        {
            System.out.println(n+" is a BUZZ number");
        }
        else
        {
            System.out.println(n+ " the number is not a BUZZ Number");
        }
    }
}
            
         // vdt 
//variable          type          use
//  n               int           to store the value inputted by the user
//                                and to check whether the no. is a buzz number or not


// answer)
//  49,70  are buzznumber
// 97, 53 are not buzz number