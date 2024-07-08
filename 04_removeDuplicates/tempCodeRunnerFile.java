import java.util.*;
public class _01_bruteForce{
    //Using HashSet
    public static int removeDuplicates(int arr[], int n)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);