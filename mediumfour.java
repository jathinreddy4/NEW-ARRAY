// Kadane alogrithm
// to find the subarray with the largest sum

public class mediumfour
{
    public static void main(String[] args) 
    {
        int arr[] = {-1,2,2,-4,1,3,-1,2};    
        int ans = brute(arr);
        System.out.println(" Using brute force : "+ ans);

        int ans1 = kadane(arr);
        System.out.println(" Using kadane algorithm : "+ans1);

    }

    public static int  brute(int arr[])
    {
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            int sum = 0 ;
            for(int j=i; j<arr.length; j++)
            {
                sum += arr[j];
                max = Math.max(max, sum);
            }   
        }
        return max;
    }

    public static int kadane(int arr[])
    {
        int sum = 0;
        int max = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
            if(sum < 0)
            {
                sum = 0;
            }
            max = Math.max(max,sum);
        }

        return max;
    }
}