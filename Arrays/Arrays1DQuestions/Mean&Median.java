 //Mean and Median of the array 
    public int mean(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int num:arr)sum += num;
        return (int)Math.floor((double)(sum/n));
    }
    public int median(int arr[]){
        int n = arr.length;
        if (n% 2 != 0) {
            return arr[n/2];
        }
        else{
            int first = arr[n/2];
            int second = arr[n/2-1];
            return (int) Math.floor((double)(first+second)/2);
        }
    }
