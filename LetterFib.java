import java.util.*;
class LetterFib
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arr[] = new char[findArrLen(n)];
        int i = 0;
        for(i = 0; i<arr.length;)
        {
            arr[i] = (char)(65+((a-1)%26));
            i++;
            a+=b;
            if(i<arr.length)
            {
                arr[i] = (char)(65+((b-1)%26));
                i++;
                b+=a;
            }
            else
            {
                break;
            }
        }
        int k = 0;
        for(i = 1; i<=n; i++)
        {
            for(int j = 0; j<i; j++)

            {
                System.out.print(arr[k]);
                k++;
            }
            System.out.println();
        }
    }

    static int findArrLen(int x)
    {
        int sum = 0;
        for(int i = 1; i<=x; i++)
        {
            sum+=i;
        }
        return sum;
    }
}