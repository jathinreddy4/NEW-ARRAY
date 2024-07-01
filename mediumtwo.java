// To sort and array of 1's,2's,0's

import java.util.*;
public class mediumtwo 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,0,2,1,1,0};  
        System.out.println("Using brute forse ");  
        sort(arr);
        System.out.println();

        ArrayList<Integer> ary = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sort1(ary);
        System.out.println("Using better solution");
        for(int i=0; i<ary.size(); i++)
        {
            System.out.print(ary.get(i)+ " ");
        }

    }    

    public static void sort(int arr[])  //brute forse (selfcoded)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] >= arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i=0;i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort1(ArrayList<Integer> ary)
    {
        int count0 = 0, count1 = 0, count2 = 0;
        //count the frequency
        for(int i=0; i<ary.size(); i++)
        {
            if(ary.get(i) == 0)
            {
                count0++;
            }
            else if(ary.get(i) == 1)
            {
                count1++;
            }
            else
            {
                count2++;
            }

        }
        //replacing 
        for(int i=0; i<count0; i++)
        {
            ary.set(i,0);
        }
        for(int i=count0; i<count1 + count2;i++)
        {
            ary.set(i,1);
        }
        for(int i=count1+count2; i<ary.size(); i++)
        {
            ary.set(i,2);
        }

    }
}
