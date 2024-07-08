
public class code {

    public static int linearSearch(int arr[],int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,9,8,7,6,1,0};
        System.out.println(linearSearch(arr, 23));
        System.out.println(arr.length);
    }
    
}
