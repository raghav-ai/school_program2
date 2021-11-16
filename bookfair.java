/*
 program to calculate and print the dscounted price of book  
  instance variables
  String Bname - to store book name
  double price - store price of book
  double dprice - store discountedprice of book
 
  void input() - input values of price and name of book
  void calculate() - to calculate the discounted price of book on basis of:-
      price of book                 discount percent
       price<=1000                      2
  price>1000 && price<=3000             10
       price>3000                       15 
       
       void display() - to print the name and discounted price
      */
import java . util.Scanner ;
class bookfair 
{
    String Bname ;
    double price,dprice;
    void input ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter book name");
        Bname = sc.nextLine();
        System.out.println("enter price");
        price = sc . nextDouble();
    }

    void calculate()
    {
        if (price <1001)
            dprice = price - price*0.02;
        else if (price>1000 && price <=3000)
            dprice = price - price * 0.1;
        else
            dprice = price - price *0.15;
    }

    void display()
    {
        System.out.println("name of the book is  " + Bname+ " discounted price = "+ dprice);
    }

    public static void main(String args[])
    {
        bookfair obj = new bookfair();
        obj . input();
        obj . calculate();
        obj . display();
    }
}
/* vdt          
 *  variable         type        use
 *  Bname            String      stores book name 
 *  price            double      stores the price of book temporarily then stores the discounted price
 */