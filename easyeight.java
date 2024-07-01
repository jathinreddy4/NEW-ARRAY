import java.util.*;

public class easyeight
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6};    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find ");
        int num = sc.nextInt();

        int ans = find(arr, num);
        System.out.println("Number found at index "  + ans);

    }

    public static int find(int[]arr, int num)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == num)
            {
                return i;
            }
        }
        return -1;
        
    }

}

    
