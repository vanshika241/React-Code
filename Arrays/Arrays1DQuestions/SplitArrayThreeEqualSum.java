// User function Template for Java
class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
         List<Integer> ans = new ArrayList<>();
         int n = arr.length;
         int tsum = 0;
         for(int num:arr)tsum += num;
         if(tsum % 3 != 0){
             ans.add(-1);
             ans.add(-1);
             return ans;
         }
         int findSum = tsum/3;
         int sum = 0;
         int cnt = 0;
         for(int i=0;i<n;i++){
             sum += arr[i];
             if(sum == findSum){
                 cnt++;
                 ans.add(i);
                 sum = 0;
                 if(cnt==2 && i<n){
                     return ans;
                 }
             }
         }
         
          ans.add(-1);
          ans.add(-1);
          return ans;
    }
}
