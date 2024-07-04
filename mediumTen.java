//  Longest  consecutive subarray

import java.util.*;
public class mediumTen
{
    public static void main(String[] args) 
    {
        int arr[] = {1,3,2,4};    
        int ans = findsequence1(arr);
        System.out.println("The longest sequnce is : " + ans);
    }

    

    public static int findsequence1(int arr[])
    {
       int maxcount  = 0;

       HashSet<Integer> hs = new HashSet<>();
       for(int i=0; i<arr.length; i++)
       {
            hs.add(arr[i]);
       }

       for(int i=0; i<arr.length; i++)
       {
            int currentnum = arr[i];
            int count = 1;

            while(hs.contains(currentnum +1))
            {
                count++;
                currentnum++;

                maxcount = Math.max(maxcount, count);
            }
       }
       return maxcount;
    }
}