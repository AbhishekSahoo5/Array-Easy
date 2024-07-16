
public class _04_optimal2 {

    public static int missingNumber(int []arr) {
        int n=arr.length;
        
        int xor1=0;
        int xor2=0;

        for(int i=0;i<n;i++)
        {
            xor2=xor2^arr[i];
            xor1=xor1^(i);
        }
        xor1=xor1^n;
        return xor1^xor2;

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
