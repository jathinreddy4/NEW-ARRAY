// To find the number that appear only once in an array

public class easytwelve 
{
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4};

        int ans1 = findusingbrute(arr);
        System.out.println("The number that appeared once is : " + ans1);
    }

    public static int findusingbrute(int []arr)
    {
        //selecting the number
        for(int i=0; i<arr.length;i++)
        {
            int num = arr[i];
            int count = 0;

            //liner search to find the count of the particular number
            for(int j=0; j<arr.length; j++)
            {
                if(num == arr[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                return num;
            }
        }
        return -1;
    }
}
