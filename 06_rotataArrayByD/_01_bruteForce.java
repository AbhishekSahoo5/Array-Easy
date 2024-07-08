
public class _01_bruteForce {

    /*
     * arr= [1,2,3,4,5,6,7]   n=2
     * output== [3,4,5,6,7,1,2]
     */

    public static void rotateArrayByN(int arr[], int d,int n)
    {
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    public static void reverse(int arr[], int start, int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int d=2;
        rotateArrayByN(arr,d,n);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
