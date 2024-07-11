
public class _01_bruteForce {

    public static boolean sum2(int arr[], int target)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        System.out.println(sum2(arr,15));

    }
    
}
