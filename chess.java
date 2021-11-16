import java.util.Scanner;
class chess
{
    void king(int si,int sj,int ei,int ej)
    {
        if(si-ei<2&&si-ei>-2&&sj-ej<2&&sj-ej>-2)
            System.out.println("King");
    }

    void queen(int si,int sj,int ei,int ej)
    {
            if(si==ei||sj==ej)
            System.out.println("queen");
            else if(Math.abs(ei-si)==Math.abs(ej-si)||si+sj==ei+ej)
        System.out.println("queen");
    }
    void bishop(int si,int sj,int ei,int ej)
    {
        if(Math.abs(ei-si)==Math.abs(ej-si)||si+sj==ei+ej)
        System.out.println("bishop");
    }
    void knight(int si,int sj,int ei,int ej)
    {
        if(((si-ei==1||si-ei==-1)&&(sj-ej==2||sj-ej==-2))||((sj-ej==1||sj-ej==-1)&&(si-ei==2||si-ei==-2)))
        {
            System.out.println("knight");
        }

    }

    void rook(int si,int sj,int ei,int ej)
    {   if(si==ei||sj==ej)
            System.out.println("rook");
    }

    void pawn(int si,int sj,int ei,int ej)
    {
        if(sj+1==ej &&si==ei)
            System.out.println("pawn");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[8][8];
        System.out.println("enter starting pos then end pos");
        int si=sc.nextInt();
        int sj=sc.nextInt();
        int ei=sc.nextInt();
        int ej=sc.nextInt();
        if((si<0||si>7)||(sj<0||sj>7)||(ei<0||ei>7)||(ej<0||ej>7))
        {
            System.out.println("wrong input");
        }
        chess obj = new chess();
        obj.king(si,sj,ei,ej);
        obj.queen(si,sj,ei,ej);
        obj.knight(si,sj,ei,ej);
        obj.bishop(si,sj,ei,ej);
        obj.rook(si,sj,ei,ej);
        obj.pawn(si,sj,ei,ej);
    }
}