import java.util.Scanner;
class rank1 extends record
{ 
    int index;
    rank1()
    {
        super();
        index=0;
    }
    void highest()
    {
        index=rnk[0];int pos=0;
        for(int i=1;i<5;i++)
        {
            if(index>rnk[i])
            {
                index=rnk[i];
                pos=i;
            }
        }
        index=pos;
    }
    void display()
    {
        super.display();
        System.out.println("Highest: "+name[index]+"    "+rnk[index]);
    }
    public static void main(String args[])
    {
        rank1 obj = new rank1();
        obj.readValue();
        obj.highest();
        obj.display();
    }
}