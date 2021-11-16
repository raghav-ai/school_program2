import java.util.Scanner;
class Node
{
    int data;
    Node left,right;
    Node()
    {
        data=0;left=null;right=null;
    }
    Node(int d,Node l, Node R)
    {
        data=d;
        left=l;
        right=R;
    }
    Node getleft()
    {
        return left;
    }
    void setl(Node l)
    {
        left=l;
    }
    void setr(Node r)
    {
        right=r;
    }
    void setl(int d)
    {
        data=d;
    }
    Node getright()
    {
        return right;
    }
    int getdata()
    {
        return data;
    }
}
class trav
{
    
}
public class test 
{
    int count=3;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c=3;
        test obj = new test();
        obj.add(3);
    }
    void add(int p)
    {
         Scanner sc = new Scanner(System.in);
       Node obj ; 
       Node obj1 ;
       Node n ;
       int d= p;
       obj = new Node();
       obj1 = new Node();
       n = new Node(d,obj,obj1);
       int l=sc.nextInt();int r=sc.nextInt();
            
       count--;
       if(count==0)
        System.out.println("done");
        else
        {
            add(l);add(r);
        }
    }
}