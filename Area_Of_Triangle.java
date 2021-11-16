// to find the area of a triangle 
import java .util.Scanner;
class Area_Of_Triangle
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base ");
        int b =sc.nextInt();
        System.out.println("Enter height");
        int h = sc.nextInt();
        double a = (b*h/2d);//formula of area of triangle =1/2*base*height
        System.out.println("area =" + a+"cm");
        String s1="hello";
        String s2 ="pencil";
        String m= s1.substring(1,1);
        System.out.println(m);
    }
}
        
     //vdt
     // variable       type         use
     //   b            int          to store the value of base of the triangle
     //   h            int          to store the value of height of the triangle
     //   a            double       to calculate the area of triangle
 // answer)
 //base = 5   height = 6 
 //answer is 15cm
 //base =2     height = 8
 //answer = 8cm