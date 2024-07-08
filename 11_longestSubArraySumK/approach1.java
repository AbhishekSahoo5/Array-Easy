
public class approach1 {
    public static int longestSubarraySumK(int arr[],int k)
    {
        int len=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k){
                    len=Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
        int k=15;
        System.out.println(longestSubarraySumK(arr, k));

    }
    
}
