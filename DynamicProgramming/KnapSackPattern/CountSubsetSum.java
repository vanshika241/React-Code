class Solution {
    // Function to calculate the number of subsets with a given sum
   public int perfectSum(int[] num, int tar) {
 int n = num.length;
        int dp[][] = new int[n+1][tar+1];
        for(int j=0;j<tar+1;j++){
            dp[0][j] = 0;
        }
        for(int i=0;i<n+1;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<tar+1;j++){
                if(num[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-num[i-1]];
                }
            }
        }
        return dp[n][tar];

}

}
