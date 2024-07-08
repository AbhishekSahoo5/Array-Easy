import java.util.*;
public class _02_optimalApproach{
    //Using Two Pointer Approach
    public static int removeDuplicates(int arr[], int n)
    {
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[j]!=arr[i])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return (i+1);
    }
    /*
        Complexity
            -->Time:- O(N)
            --> Space:- O(1)
        */
    public static void main(String[] args) {
        
        int arr[]={1,2,2,3,3,4,5,5,6,7,8};
        int n=arr.length;

        
        
    }
    
}
