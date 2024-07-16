
public class _02_better {

    public static int missingNumber(int []arr) {
        int n=arr.length;
        int temp[]=new int[n+1];

        for(int i=0;i<n;i++)
        {
            temp[arr[i]]++;
        }
        for(int i=0;i<=n;i++)
        {
            if(temp[i]==0)
            {
                return i;
            }
        }
        return -1;

        /*
         * Time complexity =O(2n)
         * Space complexity =O(n)
         */
    }
    public static void main(String[] args) {
        int a[] = {0,1, 2, 4, 5};

        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }
    
}
