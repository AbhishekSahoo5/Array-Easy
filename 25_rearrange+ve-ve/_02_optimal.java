
public class _02_optimal {

    public static int[] rearrange(int arr[])
    {
        int n=arr.length;
        int ans[]=new int[n];

        int neg=1;
        int pos=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,-4,-5};
        int res[]=rearrange(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }
        
    }
    
}
