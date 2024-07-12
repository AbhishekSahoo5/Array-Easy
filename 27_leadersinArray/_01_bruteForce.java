import java.util.ArrayList;

public class _01_bruteForce {

    public static ArrayList<Integer> leader(int arr[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean leader=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i]){
                    leader=false;
                    break;
                }
            }
            if(leader==true){
                list.add(arr[i]);
            }
        }
        return list;
        // Time complxity =0(n2)
    }

    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        ArrayList<Integer> list=leader(arr);
        System.out.println(list);
    }
    
}
