import java.util.Scanner;
class end
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();String p="";
        int counter=0;
        for(int i=s.length()-1;i>=0;i--)//2729
        {
            p=p+s.charAt(i);
            counter++;
            if(counter==2)
            {
                int n=Integer.parseInt(p);
                if((n>64&&n<=90)||(n>96&&n<100)||(char)n==' ')
                {System.out.print((char)n);}
                else{
                    p=p+s.charAt(i-1);
                    int m=Integer.parseInt(p);
                    if(m>=100&&m<=122){
                        System.out.print((char)m);
                        
                    }
                }
                counter=0;
                p="";
            }
        }
    }
}//2312179862310199501872379231018117927
 