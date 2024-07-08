import java.util.*;
public class _01_bruteForce{

    public static void rotateArray(int [] arr){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    /*
     * Time complexity=O(n)
     * Space Complexity= O(1)
     */
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        rotateArray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}

/*
 * Striver Video 17 31:00
 */