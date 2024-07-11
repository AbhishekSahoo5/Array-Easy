
public class _01_bruteForce {

    public static int[] sum2(int arr[], int target)
    {
        int n=arr.length;
        int res[]={-1,-1};
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
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
