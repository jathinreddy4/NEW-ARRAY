//  Stock buy and sell.

public class mediumSix 
{
    public static void main(String[] args) 
    {
        int arr[] = {7,1,5,3,6,4};
        int ans = profit(arr);
        System.out.println("The maximum profit is " + ans);

        int ans1 = profit1(arr);
        System.out.println("The maximum profit is " + ans1);

    } 

    public static int profit(int arr[]) //selfcoded
    {
        int maxporf = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            int prof = 0;
            for(int j= i+1; j<arr.length; j++)
            {
                prof = arr[j] - arr[i];

                maxporf = Math.max(maxporf,prof);
            }
        }
        return maxporf;
    }

    public static int profit1(int arr[])
    {
        int maxporf1 = 0;
        int minprice  = arr[0];
        int cost = 0;
        for(int i=0; i<arr.length; i++)
        {
            cost = arr[i] - minprice;
            maxporf1 = Math.max(maxporf1,cost);
            minprice = Math.min(minprice, arr[i]);
        }
        return maxporf1;
       
    }
}
//{7,1,5,3,6,4};