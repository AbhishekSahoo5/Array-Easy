
public class _01_bruteForce {

    public static int missingNumber(int []arr) {
        int n=arr.length;
        for(int i=0;i<=n;i++)
        {
            int flag=0;
            
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i){
                    flag=1;
                    break;   
                }
            }
            if(flag==0) return i;
        }
        return -1;
    }
    /*
     * Time complexity =O(n2)
     * Space Complexity =O(1)
     */
    public static void main(String[] args) {
        int a[] = {0,1, 2, 4, 5};

        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }
    
}
