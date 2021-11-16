 //program to find the tax of  an  employee using functions
//if taxincome is below 100001   no tax 
// if taxincome is between 100000 & 150000 tax=10% of taxincome
//if taxincome is  between 150000 &250000  tax= 20% of taxincome
//if taxincome is above 250000   tax = 30% of taxincome
import java .util .Scanner;
class Employee
{
    int pan ;
    String name;
    double taxincome;
    double tax;
    void input()//to get input  of the name ,pan,taxincome from the user
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.next();
        System.out.println("enter pan");
        pan = sc.nextInt();
        System.out.println("enter taxincome");
        taxincome = sc.nextInt();
    } 
    void calculate() //to calculate the tax based upon the taxincome
    {
        if(taxincome <=100000)
        tax = 0.0;
        else if (taxincome >100000&&taxincome<=150000)
        tax = (taxincome - 100000 )*0.1;
        else if(taxincome >150000&&taxincome<=250000)
        tax = (taxincome-150000 )*0.2+5000;
        else
        tax = (taxincome - 250000)*0.3+25000;
    }
    void display () // to display the information
    {
        System.out.println("pan      Name        Taxincome       tax");
         System.out.println(pan+"     "+name+"       "+taxincome+"       "+tax);
        }
    public static void main(String args [])
    {
        Employee a = new Employee(); //creating object
        a.input(); // calling function
        a.calculate();// calling function
        a.display();// calling function
    }
}
        
//vdt
// variables                type               use
// tax                      double            to store the calculated tax
// taxincome                double           to store the taxincome
//  pan                      int            to store pan number
// name                      String           to store name    