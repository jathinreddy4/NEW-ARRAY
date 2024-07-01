// find the second smallest and second largest number in array
import java.util.*;
public class easytwo 
{
    public static void main(String[] args) {
        int arr[] = {1,25,72,44,5};
        int n = arr.length;
        findsecond(arr, n);
    }   

    public static void findsecond(int[]arr, int n)
    {
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println("Second smallest : " + small);
        System.out.println("Second largest : " + large);


    }
}

// need to optimize
