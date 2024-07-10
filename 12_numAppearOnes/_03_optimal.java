
public class _03_optimal {

    public static int appearOnes(int arr[])
    {
        
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor=xor^arr[i];
        }
        return xor;

        // Time complexity =O(n)
        // Space complexity =O(1)
        
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5};
        System.out.println(appearOnes(arr));
    }
}
    

