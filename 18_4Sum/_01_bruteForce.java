import java.util.*;
public class _01_bruteForce {

    public static List<List<Integer>> sum4(int arr[],int target)
    {
        int n=arr.length;
        Set<List<Integer>> set=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    for(int l=k+1;l<n;l++)
                    {
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target)
                        {
                            List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            temp.sort(null);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> list=sum4(arr,0);
        System.out.println(list);
    }
    
}
