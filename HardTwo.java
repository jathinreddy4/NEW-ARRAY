// Majority element n/3 times.

import java.util.*;

public class HardTwo 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,2,3,2,4,4,4};
        int n = arr.length;    

        ArrayList<Integer> ans =  Majority(arr, n);
        System.out.println("The majority elements more than N/3 times are" + ans);
    }    

    public static ArrayList<Integer> Majority(int arr[], int n)
    {

        ArrayList<Integer> ls = new ArrayList<>();
        
        
        for(int i=0; i<arr.length; i++)
        {
            int count = 0;
            if( ls.size() == 0||ls.get(0) != arr[i])
            {
                
                for(int j=0; j<arr.length; j++)
                {
                    if(arr[j] == arr[i])
                    {
                        count++;
                    }
               
                }  
                if(count > (n/3))
                {
                    ls.add(arr[i]);
                }  
            }
            if (ls.size() == 2) break;
        }
        
        return ls;
    }

    public static ArrayList<Integer>  major(int arr[], int n)
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
           
        }
    }
}

