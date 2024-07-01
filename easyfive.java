// LEFT ROATATE AND ARRAY BY ONE PLACE.

public class easyfive 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};    

        for(int i=0; i<arr.length-1; i++)
        {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        print(arr);
    }
    public static void print(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]  + " ");
        }
    }

    
}
