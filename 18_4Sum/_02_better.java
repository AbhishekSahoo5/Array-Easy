import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _02_better {

    public static List<List<Integer>> sum4(int arr[],int target)
    {
        int n=arr.length;
        Set<List<Integer>> set=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                Set<Integer> hashset=new HashSet<>();
                for(int k=j+1;k<n;k++)
                {
                    int fourth=target-(arr[i]+arr[j]+arr[k]);
                    if(hashset.contains(fourth))
                    {
                        List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k],fourth);
                        temp.sort(null);
                        set.add(temp);
                    }
                    hashset.add(arr[k]);
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;

        // Time complexity O(n4)
        // space complexity O(2n)
    }

    public static void main(String[] args) {
        int arr[]={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> list=sum4(arr,0);
        System.out.println(list);
    }
    
}
