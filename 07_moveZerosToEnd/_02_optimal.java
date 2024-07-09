import java.util.ArrayList;

public class _02_optimal {

    public static void moveZeros(int arr[])
    {
        int n=arr.length;

        //find first zero in the array
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,0,20,3,12};
        moveZeros(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
