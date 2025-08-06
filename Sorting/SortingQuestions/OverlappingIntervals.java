class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]>  ans = new ArrayList<>();
        int n = arr.length;
        int start = arr[0][0];
        int end = arr[0][1];
        for(int i=1;i<arr.length;i++){
            int currStart = arr[i][0];
            int currEnd = arr[i][1];
            if(currStart<=end){
                end = Math.max(end, arr[i][1]);
               
            }
            else{
                ans.add(new int[]{start,end});
                start = currStart;
                end = currEnd;
            }
        }
        ans.add(new int[]{start,end});
        return ans;
    }
}
