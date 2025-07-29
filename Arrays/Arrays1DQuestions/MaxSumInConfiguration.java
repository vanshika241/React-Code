    //Max Sum in configuration
    void rotate(int arr[], int k){
        int n = arr.length;
        if(k ==0)return;
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
    }
    int maxSum(int[] arr) {
       int n = arr.length;
    //    int maxSum = Integer.MIN_VALUE;
    //    for(int i=0;i<n;i++){
    //        int temp[] = arr.clone();
    //        rotate(temp,i);
    //        int sum = 0;
    //        for(int j=0;j<n;j++){
    //            sum += j*temp[j];
    //        }
    //        maxSum = Math.max(maxSum,sum);
           
    //    }

    int arrSum = 0;
     int r1 = 0;
     for(int i=0;i<n;i++){
         arrSum += arr[i];
         r1 += i*arr[i];
     }
     
     int maxSum = r1;
     int curr = r1;
     for(int j=1;j<n;j++){
         curr = curr+arrSum-n*(arr[n-j]);
         maxSum = Math.max(maxSum,curr);
     }

       return maxSum;
    }

