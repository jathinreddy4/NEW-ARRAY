// Arrange the array in alternate positive and negative.

public class mediumSeven 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,-4,-5};
        sort(arr);
        for(int i=0;i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        rearrange(arr);
        
        
    }   
    
    public static void sort(int arr[])
    {
        int pos[] = new int[2];
        int neg[] = new int[2];
        int posindex = 0;
        int negindex = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > 0)
            {
                pos[posindex++] = arr[i];
                
            }
            else
            {
                neg[negindex++] = arr[i];
                
            }
        }

        for(int i=0; i<arr.length/2; i++)
        {
            arr[2*i] = pos[i];
            arr[2*i+1]= neg[i];
        }

       
    }

    public static void rearrange(int arr[])
    {
        int posindex = 0;
        int negindex = 1;

        int ans[] = new int [arr.length];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > 0)
            {
                ans[posindex] = arr[i];
                posindex += 2;
            }
            else
            {
                ans[negindex] = arr[i];
                negindex +=2;
            }
        }
        
        for(int i=0; i<ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }

    }
}
