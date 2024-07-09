
public class _03_optimalApproach {
    public static int secondLargest(int arr[],int n)
    {
        
       int largest=arr[0];
       int secLargest=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                secLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secLargest)
            {
                secLargest=arr[i];
            }
        }
        return secLargest;

        /*
        Time Complexity: O(N), Single-pass solution
        Space Complexity: O(1)
        */

            
    }
    public static void main(String[] args) {
        // int arr[]={1,2,4,7,7};
        int arr[]={7,7};
        // int arr[]={1,7,7};
        int n=arr.length;
        System.err.println(secondLargest(arr,n));
    }
    
}


/*
 * Striver Video 17 21:00
 */