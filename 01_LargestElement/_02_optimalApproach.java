public class _02_optimalApproach {

    public static int maxElement(int arr[],int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;

        /*
         *  Time Complexity: O(N)
            Space Complexity: O(1)
         */
    }
    public static void main(String[] args) {
        
        int arr[]={7,7,7,7,7,7};
        int n=arr.length;
        System.out.println(maxElement(arr, n));
    }
    
}
