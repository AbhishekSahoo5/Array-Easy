
public class _03_optimal {

    public static int longestSubarray(int arr[],int k)
    {
        // 2 pointer approach

        int n=arr.length;
        int left=0, right=0;
        int sum=arr[0];
        int maxLen=0;

        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,4,2,3};
        System.out.println(longestSubarray(arr, 5));

    }
    
}
