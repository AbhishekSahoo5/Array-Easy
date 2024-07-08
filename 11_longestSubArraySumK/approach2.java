import java.util.HashMap;

public class approach2 {
    public static int longestSubarraySumK(int arr[],int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxLen=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;

    }
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
        int k=15;
        System.out.println(longestSubarraySumK(arr, k));
    }
    
}
