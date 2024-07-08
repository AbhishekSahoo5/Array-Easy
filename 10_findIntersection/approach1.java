import java.util.ArrayList;

public class approach1 {
    public static ArrayList<Integer> intersection(int arr1[], int arr2[])
    {
        int n=arr1.length;
        int m=arr2.length;
        int visited[]=new int[m];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr1[i]==arr2[j] && visited[j]==0)
                {
                    list.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }

        return list;

        // Time complexity=O(n*m);
        //Space Complexity=O(n)
    }
    public static void main(String[] args) {
        int arr1[]={1,2,2,3,3,4,5,6};
        int arr2[]={2,3,3,5,6,6,7};

        ArrayList<Integer> list=intersection(arr1, arr2);
        System.out.println(list);














    
    }
    
}
