
public class approach1 {
    public static int longestSubarraySumK(int arr[],int k)
    {
        int len=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)