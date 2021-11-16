import java.util.Scanner;
import java.io.*;
class sent
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter a sentence");
        String s= br.readLine();
        //YOU MUST AIM TO BE A BETTER PERSON TOMORROW THAN YOU ARE TODAY.
        s=s.toUpperCase();String word="";String f="";String l="";int first=0;int n=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch= s.charAt(i);
            char ch1=s.charAt(i+1);
            if(ch1==' ')
            {
                char ch2=s.charAt(first);
                if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'))
                    {f=f+word+ch+" ";n++;}
                else
                    l=l+" "+word+ch;
                    word="";
                first=i+2;
            }
            else if(ch1=='.'||ch1==','||ch1=='!')
            {
                char ch2=s.charAt(first);
                if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'))
                    {f=f+" "+word+ch;n++;}
                else
                    l=l+" "+word+ch;
                    break;
            }
            else
            {
                word=word+ch;
            }
        }
        System.out.println(n);
        System.out.println(f+l);
    }
}