import java.util.*;
public class _01_bruteForce {
    public static int secondLargest(int arr[],int n)
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

        /*Complexity
            -->Time:- O(NlogN)
            --> Space:- O(1)
        */

            
    }
    public static void main(String[] args) {
        // int arr[]={1,2,4,7,7};
        int arr[]={7,7};
        // int arr[]={1,7,7};
        int n=arr.length;
        System.err.println(secondLargest(arr,n));
    }
    
}

/*
 * Striver Video 17 14:00
 */