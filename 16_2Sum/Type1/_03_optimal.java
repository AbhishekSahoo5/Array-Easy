import java.util.Arrays;

public class _03_optimal {

    public static boolean sum2(int arr[], int target)
    {
        int n=arr.length;
        Arrays.sort(arr);
        int left=0, right=n-1;

        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;

        /*
         * Time complexity = O(n) + O(nlogn)
         * Space Complexity = O(n)
         */
    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        System.out.println(sum2(arr,14));

    }

}
