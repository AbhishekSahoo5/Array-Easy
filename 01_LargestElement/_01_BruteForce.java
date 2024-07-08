import java.util.*;
public class _01_BruteForce {
    public static int secondLargest(int arr[], int n)
    {
        Arrays.sort(arr);
        int largest=arr[n-1];
        int secLargest=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                secLargest=arr[i];
                break;
            }
        }
        return secLargest;
    }
    public static void main(String[] args) {
        int arr[]={7,7,7,7,7,7};
        int n=arr.length;
        System.err.println(secondLargest(arr, n));
        
    }
    
}
