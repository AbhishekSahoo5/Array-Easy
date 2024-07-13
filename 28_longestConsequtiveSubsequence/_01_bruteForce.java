
public class _01_bruteForce {

    public static boolean linearSearch(int arr[],int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                return true;
            }
        }
        return false;
    }

    public static int longestConsequtiveSubsequence(int arr[])
    {
        int n=arr.length;
        int longest=1;
        for(int i=0;i<n;i++)
        {
            int x=arr[i];
            int count=1;
            while(linearSearch(arr,x+1)==true){
                x=+1;
                count+=1;
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }
    

    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1,1};
        System.out.println("jii");
        System.out.println(longestConsequtiveSubsequence(arr));

    }
    
}
