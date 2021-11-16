import java.util.Scanner;
class Cqueue
{
    int ele[];
    int cap;
    int front,rear;
    Cqueue(int max)
    {
        cap=max;
        ele= new int[cap];
        front=0;
        rear=0;
    }

    void insert(int v)
    {
        if(rear== cap-1)
            System.out.println("full from rear");
        else
        {
            int t=ele[front];
            ele[front]=v;
            for(int i=front+1 ;i<=rear+1;i++)
            {
                int p=ele[i];
                ele[i]=t;
                t=p;
            }
            rear++;
        }
    }

    int delete()
    {
        if(rear==front)
        {
            return -999;
        }
        else 
        {rear--;
        return ele[rear+1]; }
    }
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(ele[i]+"  ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cqueue obj = new Cqueue(n);
        while(sc.nextInt()!=0)
        {
            int a= sc.nextInt();
            switch(a)
            {
                case 1:
                System.out.println("enter a number");
                int p=sc.nextInt();
                obj.insert(p);
                break;
                case 2:
                int l= obj.delete();
                System.out.println("element removed "+l);
                break;
                case 3:
                obj.display();
                break;
            }
        }
        System.out.println("end");
    }
}