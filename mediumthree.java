// Find the Majority Element that occurs more than N/2 times

public class mediumthree 
{
    public static void main(String[] args) 
    {
        int arr[] = {2,2,2,3,4,4,3,2,2};
        int n = arr.length;

        int ans = findmajor(arr,n);
        System.out.println("The element appear to be more than n/2 times is " + ans);
    
    }

    public static int findmajor(int []arr, int n)
    {
        int target = n/2;
        for(int i=0; i<arr.length; i++)
        {
            int num = arr[i];
            int count = 0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[j] == num)
                {
                    count++;
                }
            }
            if(count > target)
            {
                return arr[i];
            }
        }
        return -1;
    }
}


