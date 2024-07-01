// MOVE ALL ZEROS TO END


public class easyseven 
{
    public static void main(String[] args)
    {
        int arr[] = {1,0,2,3,0,4,0,1};   
        movezero(arr); 
    }    

    public static void movezero(int[]arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j] == 0)
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " " );
        }
    }
}
