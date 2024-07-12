import java.util.ArrayList;

public class _01_bruteForce {

    public static int[] rearrange(int arr[])
    {
        int n=arr.length;
        ArrayList<Integer> positives=new ArrayList<>();
        ArrayList<Integer> negatives=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0){
                positives.add(arr[i]);
            }
            else{
                negatives.add(arr[i]);
            }
        }

        for(int i=0;i<n/2;i++)
        {
            arr[2*i]=positives.get(i);
            arr[2*i+1]=negatives.get(i);
        }
        return arr;
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
