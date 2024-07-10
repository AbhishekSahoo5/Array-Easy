
public class _01_bruteForce {

    public static int longestSubarray(int arr[],int k)
    {
        int n=arr.length;
        int maxLen=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];