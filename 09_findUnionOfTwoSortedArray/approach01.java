import java.util.*;

/*
 * arr1[]={1,2,3,4,5}
 * arr2[]={4,5,6,9,10}
 * 
 * Output:
 * {1,2,3,4,5,6,9,10}
 */
public class approach01 {

    public static ArrayList<Integer> unionOfTwoSortedArray(int arr1[],int arr2[])
    {
        int len1=arr1.length;
        int len2=arr2.length;

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<len1;i++)
        {
            set.add(arr1[i]);            //O(1)
        }
        for(int i=0;i<len2;i++)
        {
            set.add(arr2[i]);             //O(1)
        }

        ArrayList<Integer> union=new ArrayList<>();
        for (Integer element : set) {  
            union.add(element);
        }

        Collections.sort(union);                       //O(nlog(n))
        return union;


        // Time complexity =O(len1+len2)
        
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4,4,4,5,6};
        // int arr2[]={1,1,1,3,3,3,4,4,4,7,7,7};
        int arr2[]={-4,-2,-3,-4};

        ArrayList<Integer> union=unionOfTwoSortedArray(arr1,arr2);
        System.out.println(union);
    }
    
}
