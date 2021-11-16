import java.io.*;
class dr
{
    public static void main(String args[]) throws IOException
    {
        try{
        FileInputStream fr= new FileInputStream("stu.dat");
        DataInputStream d = new DataInputStream(fr);
        boolean b=false;int i=0;
        while(!b)
        {
            try{
            byte s=d.readByte();
            System.out.println(i+" "+s);
        }
        catch(EOFException e)
        {
            b=true;
        }
    }
}
    catch(FileNotFoundException ex)
    {
        System.out.println("file ot found");
    }
}

}
        