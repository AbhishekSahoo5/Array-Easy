import java.util.Arrays;
import java.util.HashSet;

public class _03_optimal {

    public static int longestConsequtiveSubsequence(int arr[])
    {
        int n=arr.length;
        if(n==0) return 0;

        HashSet<Integer> set=new HashSet<>();
        int longest=1;

        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int count=1;
                int x=it;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return  longest;
        
    }

    // Time complexity=O(3n)
    // Space complexity=O(n)
    
    

    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1,1};
        System.out.println("jii");
        System.out.println(longestConsequtiveSubsequence(arr));

    }
    
    
}
