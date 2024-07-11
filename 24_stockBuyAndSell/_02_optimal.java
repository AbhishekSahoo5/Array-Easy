
public class _02_optimal {

    public static int maxProfit(int arr[])
    {
        int n=arr.length;
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            minPrice=Math.min(minPrice, arr[i]);
            maxProfit=Math.max(maxProfit,arr[i]-minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int maxProfit=maxProfit(arr);
        System.out.println(maxProfit);
    }
    
}
