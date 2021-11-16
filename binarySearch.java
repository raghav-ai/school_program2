// program to do a binary search using arrays
import java . util.Scanner ;
class binarySearch
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0;i<n;i++)// input 
        {
            System.out.println("enter element");
            arr[i]=sc.nextInt();
        }
        int l =0;int m = 0;int flag = 0;
        int u = arr.length-1;//4
        System.out.println("enter search elements");
        int e = sc.nextInt();// search element e = 14
        // elements =  12,14,18,19,23
        while(l<=u)
        {
            m= (l+u)/2;//(1+1)/2=1
            if (e>arr[m])
            {
                l=m+1;//(l=1)
            }
            else if(e<arr[m]) 
                u=m-1;//u=1
            else
            {
                flag =1;
                break;
            }
        }
        if (flag==0){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found"+(m+1));
        }
    }
}
/* vdt          
 *  variable        type      use
 *  arr              int      stores the five values of the array 
 *  l                int      stores lower limit position
 *  m                int      stores middle  no. position
 *  u                int      stores upper limit position
 *  flag             int      checks whether it search element is present or not
 *  e                int      stores search element
 *  i                int      loop variable
 *  j                int      loop variable
 *  n                int      stores size of array
 */ 