import java .util.Scanner;
class anagram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word");
        String s = sc.next();
        char ch[]= s.toCharArray();
        int c=0;
        int n =1;
        int arr[]= new int[s.length()];
        for(int i=0;i<s.length();i++)
            arr[i]=0;
        String word="";
        for(int i=1;i<=s.length();i++)
            n= n*i;
        String set[]= new String[n];
        for(int i=0;i<n;)
        {
            for(int j=0;j<s.length();)
            {
                int p=(int)(Math.random() * (s.length()));
                if(arr[p]==0){
                    word=word+ch[p];
                    arr[p]=-1;
                    j++;
                }

            }
            for(int l=0;l<i;l++)
            {
                if(word==set[l])
                {c=1;break;}

            }
            if(c==0)
            {
                set[i]=word;
                i++;
            }
            word="";
            for(int k=0;k<s.length();k++)
                arr[k]=0;
        }

        for(int i = 0; i<n-1; i++)   
        {  
            for (int j = i+1; j<n; j++)   
            {  
                //compares each elements of the array to all the remaining elements  
                if(set[i].compareTo(set[j])>0)   
                {  
                    //swapping array elements  
                    String temp = set[i];  
                    set[i] = set[j];  
                    set[j] = temp;  
                }  
            }  
        }  
        for(int i=0;i<n;i++)
        System.out.println(set[i]);
    }
}

