// Count the number  of subarray that sum equal to  k
public class mediumFourteen 
{
    public static void main(String[] args) 
    {
        int arr[] = {3,1,2,4};
        int k  = 6;
        int ans  = countsub(arr, k);
        System.out.println("The number of subarray the sun to k are : " + ans);
        
        
    }   
    
    public static int countsub(int arr[], int k) // selfcoded
    {
        int count =0;
        for(int i=0; i<arr.length; i++)
        {
            
            int sum = 0;
            for(int j=i ; j<arr.length; j++)
            {
                sum+= arr[j];
                if(sum == k)
                {
                    count++;
                }
            }
        }
        return count;

    }
}
