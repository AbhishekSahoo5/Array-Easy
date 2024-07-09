import java.util.ArrayList;
import java.util.List;

public class _03_usingList {

    public static int secondLargest(ArrayList<Integer> arr) {
        // Code Here
        
        int largest=arr.get(0);
        int secondLargest=-1;
        int n=arr.size();
        
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)>largest)
            {
                secondLargest=largest;
                largest=arr.get(i);
            }
            else if(arr.get(i)>secondLargest && arr.get(i)<largest)
            {
                secondLargest=arr.get(i);
            }
        }
        return secondLargest;
        
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(7);
        arr.add(7);
        int res=secondLargest(arr);
        System.out.println(res);
    }
    
}
