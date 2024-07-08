Arrays.sort(arr);
        int largest=arr[n-1];
        int secLargest=0;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                secLargest=arr[i];
                break;
            }
        }
        if(largest==secLargest)
        {
            return -1;
        }
        else{
            return secLargest;
        }