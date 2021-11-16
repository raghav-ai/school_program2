import java .util .Scanner;
class Employee1
{
    public static void main(String args[])
      {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String  name = sc.next();
        System.out.println("enter pan");
        int pan = sc.nextInt();
        System.out.println("enter taxincome");
        int taxincome = sc.nextInt();
        double tax;
        if(taxincome <=100000)
        tax = 0.0;
        else if (taxincome >100000&&taxincome<=150000)
        tax = (taxincome - 100000 )*0.1;
        else if(taxincome >150000&&taxincome<=250000)
         tax = (taxincome-150000 )*0.2+5000;
        else
        tax = (taxincome - 250000)*0.3+25000;
         System.out.println("pan     Name     Taxincome     tax");
         System.out.println(pan+"     "+name+"       "+taxincome+"       "+tax);
        }
}
        
        
        
        
        
        
        
    
    