class Solution {
    
    public int minSumKadanes(int arr[]){
        int minSum = arr[0];
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum = Math.min(sum+arr[i],arr[i]);
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }
    
    public int maxSumKadanes(int arr[]){
        int maxSum = arr[0];
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum = Math.max(sum+arr[i],arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public int maxCircularSum(int arr[]) {
        // code here
        int tsum = 0;
        for(int num:arr)tsum += num;
        int minSum = minSumKadanes(arr);
        int maxSum = maxSumKadanes(arr);
        if(maxSum<0)return maxSum;
        return Math.max(maxSum, tsum-minSum);
        
    }
}
