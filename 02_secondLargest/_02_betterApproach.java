
public class _02_betterApproach {
    public static int secondLargest(int arr[],int n)
    {
        
        int largest=arr[0];
        int secLargest=-1;

        //first pass---> find the largest
        for(int i=0;i<n;i++)
        {   
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        
        //second pass---> find the second largest
        for(int i=0;i<n;i++)
        {
            if(arr[i]>secLargest && arr[i]<largest)
            {
                secLargest=arr[i];
            }
        }
        return secLargest;

        /*
        Complexity
            -->Time:- O(2N)
            --> Space:- O(1)
        */

            
    }
    public static void main(String[] args) {
        // int arr[]={1,2,4,7,7};
        // int arr[]={7,7};
        int arr[]={1,7,7};
        int n=arr.length;
        System.err.println(secondLargest(arr,n));
    }
    
}


/*
 * Striver Video 17 17:00
 */