import java.util.*;
public class _01_bruteForceApproach {
    public static boolean checkIfSorted(int arr[], int n)
    {
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    /*
        Complexity
            -->Time:- O(N)
            --> Space:- O(1)
        */
    public static void main(String[] args) {
        // int arr[]={1,2,4,7,7};
        int arr[]={1,10,2,3,4,5,7,7};
        // int arr[]={1,7,7};
        int n=arr.length;
        System.err.println(checkIfSorted(arr, n));
    }
    
}

/*
 * Striver Video 17 29:00
 */