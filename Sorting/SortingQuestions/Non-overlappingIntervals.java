class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        int n = intervals.length;
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
        int end = intervals[0][1];
        int cnt =0;
        for(int i=1;i<n;i++){
            
            if(intervals[i][0]<end){
                cnt++;
                end = Math.min(end,intervals[i][1]);
            }
            else{
                end  = intervals[i][1];
            }
           
            
            
        }
        return cnt;
    }
}
