// Longest subarray with a gievn sum k 

public class easythirteen 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,10,15};
        int k = 15;  

        int ans = findlength(arr, k);
        System.out.println("The longest subarray for sum "+ k + " is : " + ans);
    }

    public static int findlength(int arr[], int k)
    {
        int count = 0;
        int max = 0;
        int sum =0;
        for(int j=0; j<arr.length; j++)
        {
            sum +=arr[j];
            count++;

            if(sum == k)
            {
                break;
            }

            max= Math.max(max,count);
        }
        return count;
    }
}
