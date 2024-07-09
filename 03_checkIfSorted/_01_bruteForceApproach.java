import java.util.*;
public class _01_bruteForceApproach {
    public static boolean checkIfSorted(int arr[])
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }

        return count<=1;
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
        System.err.println(checkIfSorted(arr));
    }
    
}

/*
 * Striver Video 17 29:00
 */