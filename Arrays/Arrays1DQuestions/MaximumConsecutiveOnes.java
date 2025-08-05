class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int n = arr.length;
        int zeros = 0;
        int maxCount = 0;
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j] == 0)zeros++;
            while(zeros>k){
                if(arr[i] == 0)zeros--;
                i++;
            }
            maxCount = Math.max(maxCount,j-i+1);
            j++;
        }
        return maxCount;
    }
}
