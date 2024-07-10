import java.util.HashMap;

public class _02_better {
    
    public static int appearOnes(int arr[])
    {
        
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int value=map.getOrDefault(arr[i], 0);
            map.put(arr[i],value+1);
        }

        for(int i=0;i<n;i++)
        {
            if(map.get(arr[i])==1)
            {
                return arr[i];
            }
        }
        return -1;

        // Time complexity =O(2n)
        // Space complexity =O(M) M--> size of hashmap
        
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5};
        System.out.println(appearOnes(arr));
    }
}
