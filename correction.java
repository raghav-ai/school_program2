import java.util.Scanner;
class correction
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter name");
        String name= sc.next();
        System.out.println("enter income");
        int n = sc.nextInt();
        System.out.println("enter  performance rating must be written in capital ");
        char na= sc.next().charAt(0);
        System.out.println("enter  comp position   must be written  like this example = 22 not like this =22p");
        int nam = sc.nextInt();
        double amt= 0.0;
        if(na ==65)
        amt= amt+ n+(n*0.3);
        else if (na==66)
        amt= amt+ n+(n*0.2);
        else if (na==67)
        amt= amt+ n+(n*0.1);
        else if(na==68)
        amt= amt+ n;
        else{
        System.out.println("invalid correctional percentage");
        }
        if (nam<25)
        amt = amt + (n*0.1);
        else if (nam>=25&&nam<=75)
        amt = amt;
        else if(nam>75)
        amt= amt-(n*0.05);
        System.out.println(name +"\t" +n+"\t" +amt);
    }
}
        
    
        