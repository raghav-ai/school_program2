// program to show costructor overloading and default constructor
import java .util.Scanner ;
class constructorOverloading
{
    int n ;
    int i;
     double d;
     double e;
     constructorOverloading () // it is an default constructor
     {
         n = 0;
         i = 0;
         d = 0.0;
         e= 0.0;
        }
        void cal (int n ,int i)
        { 
            int z = n+i /n;
        System.out.println(z);
    }
    void cal(double d,double e)
    {
        double z = d+e*e;
        System.out.println(z);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
       constructorOverloading obj = new constructorOverloading();//creating an object called obj
       obj.cal (2,4);  //calling an function
       obj.cal(4.0 ,2.0);
    }
}
// vdt
// variable         type            
//   n              int
//   i              int
//   d              double
//   e              double 


//  answer 
//  4
//  8.0 