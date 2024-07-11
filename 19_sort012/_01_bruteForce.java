import java.util.ArrayList;

public class _01_bruteForce {

    public static void sort012(int arr[])
    {
        int n=arr.length;
        int c0=0, c1=0, c2=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(arr[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==0)  c0++;
            if(list.get(i)==1)  c1++;
            if(list.get(i)==2)  c2++;
        }
        for(int i=0;i<c0;i++) list.set(i,0);
        for(int i=c0;i<c0+c1;i++) list.set(i,1);
        for(int i=c0+c1;i<n;i++) list.set(i,2);

        for(int i=0;i<n;i++)
        {
            arr[i]=list.get(i);
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
