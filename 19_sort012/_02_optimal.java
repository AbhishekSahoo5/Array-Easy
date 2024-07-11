
public class _02_optimal {
    public static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void sort012(int arr[])
    {
        // Dutch National Flag Algorithm
        
        int n=arr.length;
        int start=0;
        int mid=0;
        int end=n-1;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,start,mid);
                start++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,end);
                end--;
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,1,0,2,1,0};
        sort012(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
