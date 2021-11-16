import java.util.Scanner;
class cona
{
    int l;
    cona()
    {
       l=1; 
    }
    cona(int i)
    {
        this();
    }
    void al()
    {
        System.out.println(l);
    }
    public static void main(String args[])
    {
        cona a= new cona(0);
        a.al();
    }
}