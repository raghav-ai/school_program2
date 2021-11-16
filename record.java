import java.util.Scanner;
class record
{
    String name[];
    int rnk[];
    record()
    {
        name=new String [5];
        rnk=new int[5];
    }
    void readValue()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            name[i]=sc.next();
            rnk[i]=sc.nextInt();
        }
    }
    void display()
    {
        for(int i=0;i<5;i++)
        System.out.println(name[i]+"    "+rnk[i]);
    }
}