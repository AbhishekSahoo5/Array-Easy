public class _01_bruteForce {

    public static int appearOnes(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;

        // Time complexity =O(n2)
        // Space complexity =O(1)

    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5};
        System.out.println(appearOnes(arr));
    }
    
}
