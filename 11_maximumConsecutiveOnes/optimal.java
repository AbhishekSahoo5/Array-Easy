
public class optimal {

    public static int maxConOnes(int arr[])
    {
        int n=arr.length;
        int maxCount=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                max++;
            }
            else{
                max=0;
            }
            maxCount=Math.max(max,maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(maxConOnes(arr));

    }
    
}
