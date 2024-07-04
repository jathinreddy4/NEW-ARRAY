 // leaders in array
public class mediumNine 
{
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
        leader(arr);

    }

    public static int  leader(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    continue;
                }
                return arr[i];
            }
        }
        return arr[i];
    }
}
