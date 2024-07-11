
public class _01_bruteForce {
    public static int maxProfit(int arr[])
    {
        int n=arr.length;
        int maxProfit=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i]){
                    maxProfit=Math.max(maxProfit,arr[j]-arr[i]);
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int maxProfit=maxProfit(arr);
        System.out.println(maxProfit);
    }
    
}
