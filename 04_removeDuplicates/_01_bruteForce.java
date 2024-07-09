import java.util.*;
public class _01_bruteForce{
    //Using HashSet
    public static int removeDuplicates(int arr[], int n)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);
        int k=set.size();
        int j=0;
        for(int x:set){
            arr[j++]=x;
        }
        return k;
    }
    /*
        Complexity
            -->Time:- O(N)
            --> Space:- O(1)
        */
    public static void main(String[] args) {
        
        // int arr[]={1,1,10,1010,2,3,4,5,7,7};
        int arr[]={1,1,2};
        int n=arr.length;

        // HashSet<Integer> set=removeDuplicates(arr, n);
        System.out.println(removeDuplicates(arr,n)); 
    }
    
}

/*
 * Striver Video 17 31:00
 */