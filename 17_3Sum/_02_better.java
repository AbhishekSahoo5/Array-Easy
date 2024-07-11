import java.util.*;
public class _02_better {
    public static List<List<Integer>> sum3(int arr[]){
        int n=arr.length;

        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            Set<Integer> hashset=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third=-(arr[i]+arr[j]);

                if(hashset.contains(third)){
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    set.add(temp);
                }
                hashset.add(arr[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;

        /*
         * Time complexity =O(n2 * logn)
         * space complexity = O(2n)
         */
    }

    public static void main(String[] args) { 
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> list=sum3(arr);
        System.out.println(list);

    }
    
}
