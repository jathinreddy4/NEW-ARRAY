//  Three sum problem,  to  find triplets that sum upto 0

import java.util.*;
public class HardThree
{
    public static void main(String[] args) {
        
        int arr[] = {-1,0,1,2,-1,-4};

        List<List<Integer>> Ans  = threesum(arr);
        for(List<Integer> it : Ans)
        {
            System.out.print("[");
            for(Integer i : it)
            {
                System.out.print(i + " ,");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static List<List<Integer>> threesum(int arr[])
    {
        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                for(int k = j+1; k <arr.length; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == 0)
                    {
                        List<Integer> temp =  Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }

        List<List<Integer>> ans  =  new ArrayList<>(st);
        return ans;
    }
}