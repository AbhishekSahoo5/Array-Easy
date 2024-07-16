
public class _03_optimal1 {

    public static int missingNumber(int []arr) {
        int n=arr.length;
        
        int sum=(n*(n+1))/2;

        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum2+=arr[i];
        }
        int missingNum=sum-sum2;
        return missingNum;

        /*
         * Time complexity =O(n)
         * Space complexity =O(1)
         */
    }
    public static void main(String[] args) {
        int a[] = {0,1, 2, 4, 5};

        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }
    
}
