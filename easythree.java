// TO  CHECK IF THE ARRAY IS SORTED

import java.util.*;
public class easythree
{
    public static void main(String[]args)
    {
        int arr[] = {1,2,3,3,4,5,6,1};
        boolean ans = checksort(arr);
        System.out.println(ans);
    }

    public static boolean checksort(int []arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
            
        }
        return true;
    }
}