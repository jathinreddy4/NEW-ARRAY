//Maximum Consecutive 1's in an array

public class easyeleven 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,0,0,1,1,1,};     
        int ans  = findmax(arr);
        System.out.println("Max consecutive 1's in array is " + ans);
    }   

    public static int findmax(int []arr)
    {
        int count = 0;
        int max = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 1)
            {
                count++;
            }
            else
            {
                count = 0;
            }

            max = Math.max(max, count);
        }
        return max;

        
    }
}
