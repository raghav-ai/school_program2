/* Progr--------am to show the nested if else statement
 * If type of purchase is laptop (l) discounted price 
 * amount                                                     discount
 *  less than 25000                                           no discount
 *  less than 57001 and more than 25000                       5
 *  less than 100001 and more than 57000                      7.5
 *  above 100000                                              10
 *   
 *   if type of purchase is desktop (d) discounted price 
 *   less than 25000                                           5
 *  less than 57001 and more than 25000                       7.6
 *  less than 100001 and more than 57000                      10
 *  above 100000                                              15
 */
import java .util.Scanner;
class Electronics 
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter address and Name");
        String  Address = sc.nextLine();
        String name = sc.next();
        
       
        System.out.println(" Enter amount of purchase");
        int a = sc.nextInt ();
        System.out.println(" Enter type of purchase (l for laptop and d for desktop)");
        String b = sc .next();
        if ( b=="l")
        {
            if (a<=25000)
            {

                double d = 0;
                System.out.println("Bill = " + name +" address  " +Address + " amount of purchase = " +a+ " discount" + d+
                    " net amount " + a);
            }
            else if (a > 25000 && a<= 57000)
            {
                ;
                double d =5d ;
                System.out.println("Bill = " + name +" address  " +Address + " amount of purchase = " +a+ " discount" +d+
                    " net amount " + (a - (a*d/100)));
            }
            else if (a>=57001 && a<=100000)
            { 
                double d = (7.5d);   
                System.out.println("Bill = " + name +" address  " +Address + " amount of purchase = " +a+ " discount" +d+
                    " net amount " + (a - (a*d/100))); 
            } 
            else 
            { 

                double d = 10;   
                System.out.println("Bill = " + name +" address " +Address + " amount of purchase = " +a+ " discount" +d+
                    " net amount " +( a - (a*d/100))); 
            }
        }
        else 
        {
            if (a<=25000)
            {

                double d = 5;
                System.out.println("Bill = " + name +" address  " +Address + " amount of purchase = " +a+ " discount" + d+
                    " net amount " + (a-(a*d/100)));
            }
            else if (a > 25000 && a<= 57000)
            {
                ;
                double d =(7.6d);
                System.out.println("Bill = " + name +" address  " +Address + " amount of purchase = " +a+ " discount" +d+
                    " net amount " + (a - (a*d/100)));
            }
            else if (a>=57001 && a<=100000)
            { 
                double d = 10;   
                System.out.println("Bill = " + name +" address " +Address + " amount of purchase = " +a+ " discount" +d+
                    " net amount " + (a - (a*d/100))); 
            } 
            else 
            { 

                double d =15 ;   
                System.out.println("Bill = " + name +" address " +Address + " amount of purchase = " +a+ " discount" +d+
                    " net amount " +( a - (a*d/100))); 
            }
        }
    }
}
 /* vdt          
 *  variable         type        use
 *  name             String      stores the name of buyer
 *  address          String      stores the address of the buyer
 *  a                int         stores the amount of purchase
 *  b                String      checks whether the purchased item is laptop or desktop
 *  d                double      stores the discount 
 */