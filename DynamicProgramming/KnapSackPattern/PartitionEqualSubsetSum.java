class Solution {
    public Boolean isSubsetSum(int arr[], int target) {
        
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][target+1];
        for(int j=0;j<target+1;j++){
            dp[0][j] = false;
        }
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++){
                boolean inc = false;
                if(arr[i-1]<=j){
                    inc = dp[i-1][j-arr[i-1]];
                }
                boolean exc = dp[i-1][j];
                dp[i][j] = inc || exc;
            }
        }
        return dp[n][target];
        
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int tsum = 0;
        for(int num:nums)tsum += num;
        if(tsum % 2 != 0)return false;
        return isSubsetSum(nums,tsum/2);
    }
}
