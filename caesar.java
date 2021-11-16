/*Program to encode or decode a sentence. 
 * Caesar code - To move each characters ascii value to add 13
 * for example 
 * a=97==>a+13=110==>n
   */
import java.util.Scanner;
class caesar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sentence");
        String s = sc.nextLine();
        System.out.println("enter 1 to encrypt and 2 to decipher");
        int n= sc.nextInt();
        String a="";
        switch(n)
        {
            case 1:
            {
                for(int i =0;i<s.length();i++)
                {
                    char ch = s.charAt(i);
                    if(Character.isLowerCase(ch))
                    {
                        int p=ch+13;
                        if(p>122)
                            a=a+(char)(96+(p-122));
                        else
                            a=a+(char)p;
                    }
                    else if(Character.isUpperCase(ch))
                    {
                        int p=ch+13;
                        if(p>90)
                            a=a+(char)(64+(p-90));
                        else
                            a=a+(char)p;
                    }
                    else 
                        a=a+ch;

                }

                System.out.println(a);
                break;
            }

            case 2:
            {
                for(int i =0;i<s.length();i++)
                {
                    char ch = s.charAt(i);
                    if(Character.isLowerCase(ch))
                    {
                        int p=ch-13;
                        if(p<97)
                            a=a+(char)(122-((96-p)));
                        else
                            a=a+(char)p;
                    }
                    else if(Character.isUpperCase(ch))
                    {
                        int p=ch-13;
                        if(p<65)
                            a=a+(char)(90-((64-p)));
                        else
                            a=a+(char)p;
                    }
                    else 
                        a=a+ch;
                }
                System.out.println(a);
                break;
            }
            default :
            System.out.println("wrong number");

        }
    }
}
/* Variable Data Table (VDT)
 * Variable Name    Datatype   Use
 *       s          String     to store the Sentence
 *       n          int        to choose whether to encode or decode
 *       a          String     to store the new word
 *       p          int        to store the ascii value of the new character
 *       ch         char       to store the character at a specific index of the String s
 *       i          int        loop variables
*/