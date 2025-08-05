 public int getSecondLargest(int[] arr) {
        int max = arr[0];
        int smax = -1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                smax = max;
                max = arr[i];
            }
            if(arr[i]<max && arr[i]>smax){
                smax = arr[i];
            }
        }
        return smax;
    }
