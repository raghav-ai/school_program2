import java .util.Scanner;
 class bubble
 {
     public static void main(String args[])
     {
         Scanner sc = new Scanner(System.in);
         int arr[]= new int[5];
         System.out.println("enter elements");
         for(int i=0;i<5;i++)
         {
             arr[i]= sc.nextInt();
            }
            
            for(int i=0;i<5;i++)
            {
                for (int j=0;j<5-i-1;j++)
                {
                    if(arr[j+1]<arr[j])
                    {
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for (int i=0;i<5;i++)
            {
                System.out.println(arr[i]);
            }
            }
        }