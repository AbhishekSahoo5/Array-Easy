import java.util.*;
public class _02_optimal {

    public static ArrayList<Integer> leader(int arr[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--)
        {
            if(max==arr[i]){
                list.add(arr[i]);
            }
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
        // Time complxity =0(n2)
    }

    public static void main(String[] args) {
        int arr[]={10,22,22,12,3,0,6};
        ArrayList<Integer> list=leader(arr);
        System.out.println(list);
    }
    
}
