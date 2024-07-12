import java.util.*;
public class _03_2ndType {

    public static int[] rearrange(int arr[])
    {
        int n=arr.length;
        // n(+ve)>n(-ve)
        // n(-ve)>n(+ve)

        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int pSize=pos.size();
        int nSize=neg.size();
        if(pSize<nSize)
        {
            for(int i=0;i<pSize;i++)
            {
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int index=pSize*2;
            for(int i=pSize;i<nSize;i++)
            {
                arr[index]=neg.get(i);
                index++;
            }
        }

        else{
            for(int i=0;i<nSize;i++)
            {
                arr[2*i]=pos.get(i);
                arr[2*i+1]=neg.get(i);
            }
            int index=nSize*2;
            for(int i=nSize;i<pSize;i++)
            {
                arr[index]=pos.get(i);
                index++;
            }
        }
        
        return arr;
    }

    // Time complexity =O(2n)
    // Space complexity =O(n)

    public static void main(String[] args) {
        int arr[]={1,2,-4,-5,3,4};
        int res[]=rearrange(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    
}
