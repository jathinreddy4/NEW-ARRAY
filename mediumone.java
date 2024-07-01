// Two sum problem
import java.util.*;
public class mediumone 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,6,5,8,11};
        int target =8 ;    
        twosum(arr, target);

        String ans = twosum1(arr, target);
        System.out.println(ans);

    }    

    public static String twosum(int arr[],  int target)  // Brute force solutioin
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    System.out.println("The 2 number that sum up to target " + target + " are " + arr[i] +" and " + arr[j]);
                }
               
            }
        }
        return "NO";
    }

    public static String twosum1(int arr[], int target)
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            int num = arr[i];
            int moreneeded = target - num;
            
            {
                if(mp.containsKey(moreneeded))
                {
                    return "YES";
                }
            }
            mp.put(arr[i], i);
        }
        return "NO";

    }
}
