import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class _01_bruteForce{

    public static List<List<Integer>> sum3(int arr[])
    {
        HashSet<List<Integer>> set=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        List<Integer> oneArr=Arrays.asList(arr[i],arr[j],arr[k]);
                        oneArr.sort(null);
                        set.add(oneArr);

                    }
                }
            }
        }
        List<List<Integer>> list=new ArrayList<>(set);
        return list;

        // Time complexity =O(n3)
        // Space complexity= O(2n)
    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> list=sum3(arr);
        System.out.println(list);

    }
}