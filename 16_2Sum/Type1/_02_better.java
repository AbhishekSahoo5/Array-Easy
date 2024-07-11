import java.util.HashMap;

public class _02_better {
    public static boolean sum2(int arr[], int target)
    {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            int moreNeeded=target-num;
            if(map.containsKey(moreNeeded))
            {
                return true;
            }
            map.put(arr[i],i);
        }
        return false;

        /*
         * Time complexity = O(n)
         * Space Complexity = O(n)
         */
    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        System.out.println(sum2(arr,14));

    }
    
}
