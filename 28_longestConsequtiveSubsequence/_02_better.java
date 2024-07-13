import java.util.*;
public class _02_better {

    public static int longestConsequtiveSubsequence(int arr[])
    {
        int n=arr.length;
        if(n==0) return 0;


        Arrays.sort(arr);
        int lastSmaller=Integer.MIN_VALUE;
        int count=0;
        int longest=1;

        for(int i=0;i<n;i++)
        {
            if(arr[i]-1==lastSmaller){
                lastSmaller=arr[i];
                count++;
            }
            else if(arr[i]!=lastSmaller){
                lastSmaller=arr[i];
                count=1;
            }
            longest=Math.max(longest,count);
        }
        return longest;
        
    }

    // Time complexity=O(nlogn)+O(n)
    // Space complexity=O(1)
    
    

    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1,1};
        System.out.println("jii");
        System.out.println(longestConsequtiveSubsequence(arr));

    }
    
}
