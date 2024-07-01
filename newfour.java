// TO REMOVE DUPLICATES FROM THE ARRAY

import java.util.*;

public class newfour 
{
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,5,6};
        int k= removeduplicates(arr);
        
        for(int i=0; i<k; i++)
        {
            System.out.print(arr[i] + " ");
        }

        /*int ans = removeduplicates1(arr);
        System.out.println("optimal :" + ans); */


        int ans2 = removeduplicates2(arr);
        System.out.println("Randomm solution : "  + ans2);
    }    

    public static int removeduplicates(int []arr)
    {
       HashSet <Integer> set = new HashSet<>();

       for(int i=0; i<arr.length; i++) // push elements into  hashset
       {
            set.add(arr[i]);
       }

       // adding hashset elements into array
       int j = 0;
       for(int x : set)
       {
            arr[j++] = x;
       }

       //size of hashset 
       int k = set.size();
    return k;

            
    }

     /*public static int removeduplicates1(int []arr)
    {
        int count =1;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] == arr[i+1] && i<arr.length)
            {
                continue;
            }
            else
            {
                count++;
            }
        }
        return count;
    } */


    //my own thinking
    public static int removeduplicates2(int arr[])
    {
        int count = arr.length - 2;
        return count;
    }
}
//{1,2,2,3,4,5,5,6}