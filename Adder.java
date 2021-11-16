/* Program to add the hour and minutes using object passing
*/
import java .util.Scanner;
class Adder
{
    int a[];
    Adder()
    {
        a = new int [2];
    }

    void readTime()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter no.of hours,minutes");
        a[0] =sc.nextInt();
        a[1]=sc.nextInt();
    }

    Adder addTime(Adder d , Adder b)
    {
        this.a[0]= d.a[0] +b.a[0];
        int sum = d.a[1] +b.a[1];
        int m =sum/60;                    
        this.a[1]= sum -(m*60);     
        this.a[0] =this.a[0]+m;
        return this;
    }

    void display()
    {
        System.out.println("hours ="+a[0]+ " minutes ="+a[1]);
    }

    public static void main(String args[])
    {
        Adder d = new Adder();
        Adder b = new Adder();
        d.readTime();
        b.readTime();
        Adder c = new Adder();
        c.addTime(d,b);
        c.display();
    }
}
/* Variable data Table(VDT)
 * Variable Name    Datatype    Use
 *       a          int         stores both hour and minutes(a[0]=hour,a[1]=minutes)
 *       sum        int         sum of hours
 *       m          int         number of hours from adding the minutes
*/
