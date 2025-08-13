import java.util.Arrays;

public class KnapSackImp{

    public static int knapSackRecursive(int wt[], int profit[], int n, int W){
        if (n== 0 || W == 0) {
            return 0;
        }
        if (wt[n-1]>W) {
            return knapSackRecursive(wt, profit, n-1, W);
        }
        else{
            return Math.max( profit[n-1]+knapSackRecursive(wt, profit, n-1, W-wt[n-1]), knapSackRecursive(wt, profit, n-1, W));
        }
    }

    public static int knapSackMemo(int wt[], int profit[], int n, int W, int dp[][]){
        if (n== 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n-1]>W) {
            return dp[n][W] = knapSackMemo(wt, profit, n-1, W,dp);
        }
        else{
            return dp[n][W] =  Math.max( profit[n-1]+knapSackMemo(wt, profit, n-1, W-wt[n-1],dp), knapSackMemo(wt, profit, n-1, W,dp));
        }
    }

    public static int knapSackTabulation(int wt[], int profit[], int W){
        int n = wt.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if (wt[i-1]>j) {
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(profit[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int wt[] = {3,4,2};
        int profit [] = {5,6,4};
        int n = wt.length;
        int W = 6;
        System.out.println("Knapsack Max Profit (Using Recursive approach) "+knapSackRecursive(wt, profit, n, W));
        int dp[][] = new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println("Knapsack Max Profit (Using Memoization approach) "+knapSackMemo(wt, profit, n, W,dp));
        System.out.println("Knapsack Max Profit (Using Tabulation approach) "+knapSackTabulation(wt, profit,W));

    }
}
