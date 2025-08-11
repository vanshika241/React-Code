class Solution {
    public int hIndex(int[] citations) {
        // code here
        int n = citations.length;
        Arrays.sort(citations);
        int ans = 0;
        for(int i=0;i<n;i++){
            int height = n-i;
            int width = citations[i];
            if(width>=height){
                return height;
            }
        }
        return ans;
    }
}
