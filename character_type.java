// program to check whether the character is a digit , upper case letter,lowercase letter or a special character
import java . util.Scanner;
class character_type
{
     public static void main (String args [])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println (" enter a word , digit or a special character ");
      char ch = sc.next().charAt(0);
      if( ch>=65 && ch<=90)    //using ascii values  A-Z = 65-90
      {
          System.out.println("your word is in upper case letter");
        }
        else if (ch >= 97 && ch<= 122)  //using ascii values  a-z = 97 -122
        {
            System.out.println(" your word is in lower case letter");
        }
        else if ( ch >= 48 && ch<= 57) //using ascii values  0-9 = 48-57
        {
            System.out.println(" it is a number  ");
        }
        else  //using ascii values  . rest are special characters
        {
            System.out.println(" it is a special character");
        }
    }
}
 //  vdt
 // variable          type          use
 //    c               char         to store the value entered by the user to check whether it is a digit upper case letter, lowercase letter  
 //                                  or a special character