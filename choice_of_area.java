import java .util.Scanner;
class choice_of_area
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" press 1. to find perimeter of rectangle");
        System.out.println("press 2. to find  area of rectangle");
        System.out.println(" press 3. to find volume of cuboid");
        System.out.println("enter your choice");
        int i = sc.nextInt ();
        switch(i)
        {
            case 1:
            System.out.println("enter length");
            int l = sc.nextInt();
            System.out.println("enter breadth");
            int b= sc.nextInt();
            System.out.println("perimeter ="+ (l+b));
            break;
            case 2:
            System.out.println(" enter length");
            l = sc.nextInt();
            System.out.println("enter breadth");
             b = sc.nextInt();
            System.out.println("Area = " + (l*b));
            break;
            case 3 :
            System.out.println("enter length");
             l = sc.nextInt();
            System.out.println("enter breadth");
             b = sc.nextInt();
            System.out.println("enter height");
            int h= sc.nextInt();
            System.out.println("volume = " +(l*b*h));
            break;
            default :
            System.out.println(" you don't understand to press from 1,2,3");
            System.out.println (" you are an idiot");
        }
    }
}
            
            
            
  