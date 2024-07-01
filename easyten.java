//Find missing number in an array
public class easyten 
{
    public static void main(String[] args)      // this can be used when the array is sorted. (selfcoded)
    {
        int arr[] = {1,2,3,4,5,6,8};    

        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]+1 == arr[i+1])
            {
                continue;
            }
            else
            {
                System.out.println(" The missing number is : "+ (arr[i]+ 1));
            }
        }

       
    }   
    
    
}
