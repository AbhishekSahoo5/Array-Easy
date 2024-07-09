import java.util.*;
public class _01_BruteForce {
    public static int secondLargest(int arr[], int n)
    {
        Arrays.sort(arr);
        return arr[n-1];

        // Time complexity = O(nlogn)
        // Space Complexity = O(1)
    }
    public static void main(String[] args) {
        int arr[]={7,7,7,7,7,7};
        int n=arr.length;
        System.err.println(secondLargest(arr, n));
        
    }
    
}
