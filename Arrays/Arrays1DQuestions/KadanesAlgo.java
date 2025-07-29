    //Kadanes Algorithm
    public int maxSubarraySum(int arr[]){
        int n = arr.length;
        int maxSum = arr[0];
        int sum  =arr[0];
        for(int i=1;i<n;i++){
            sum = Math.max(sum+arr[i], arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }
