
public class _01_bruteForce {

    /*
     * arr= [1,2,3,4,5,6,7]   n=2
     * output== [3,4,5,6,7,1,2]
     */

     public static void rotateArrayByN(int[] nums, int k) 
     {
         int n=nums.length;
         k=k%n;
         
         reverse(nums,0,n-1);
         reverse(nums,0,k-1);
         reverse(nums,k,n-1);
     }
     
     public static void reverse(int arr[],int start, int end)
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
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        rotateArrayByN(arr,d);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
