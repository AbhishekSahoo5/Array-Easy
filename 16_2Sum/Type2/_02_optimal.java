import java.util.HashMap;

public class _02_optimal {
    public static int[] sum2(int arr[], int target)
    {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]={-1,-1};

        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            int moreNeeded=target-num;
            if(map.containsKey(moreNeeded))
            {
                res[0]=map.get(moreNeeded);
                res[1]=i;
                return res;
            }
            map.put(arr[i],i);
        }
        return res;

        /*
         * Time complexity = O(n)
         * Space Complexity = O(n)
         */
    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int res[]=sum2(arr, 14);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
    
}
