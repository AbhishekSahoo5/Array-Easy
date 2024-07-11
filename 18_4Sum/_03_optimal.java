import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _03_optimal {

    public static List<List<Integer>> sum4(int arr[],int target)
    {
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1 && arr[j]==arr[j-1]) continue;

                int k=j+1;
                int l=n-1;

                while(k<l){
                    int sum=arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target){
                        List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        while(k<l && arr[k]==arr[k-1]) k++;
                        while(k<l && arr[l]==arr[l+1]) l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return ans;

        // Time complexity O(n4)
        // space complexity O(2n)
    }

    public static void main(String[] args) {
        int arr[]={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> list=sum4(arr,0);
        System.out.println(list);
    }
    
}
