import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class _01_bruteForce {

    public static void moveZeros(int arr[])
    {
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0){
                list.add(arr[i]);
            }
        }
        int nz=list.size();
        for(int i=0;i<nz;i++)
        {
            arr[i]=list.get(i);
        }
        for(int i=nz;i<n;i++)
        {
            arr[i]=0;
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
