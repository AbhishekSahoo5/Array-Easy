import java.util.*;

public class approach02 {

    //Two Pointer Approach
    
    public static ArrayList<Integer> union(int arr1[],int arr2[])
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int i=0,j=0;
        ArrayList<Integer> union=new ArrayList<>();

        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1)
        {
            if(union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<n2)
        {
            if(union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        
        int arr1[]={1,3,4,4,4,4,5,6};
        int arr2[]={1,1,1,3,3,3,4,4,4,7,7,7};

        ArrayList<Integer> union=union(arr1,arr2);
        System.out.println(union);
    }
}
