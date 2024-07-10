import java.util.HashMap;

public class optimal {

    public static int longestSubarray(int arr[],int k)
    {
        // prefix sum
        int sum=0;
        int maxLen=0;
        int n=arr.length;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                maxLen=Math.max(maxLen,i+1);
            }

            int rem=sum-k;
            if(map.containsKey(rem))
            {
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }

            if(!map.containsKey(sum))
            {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,-2,-2,4,2,3};
        System.out.println(longestSubarray(arr, 5));

    }
    
}
