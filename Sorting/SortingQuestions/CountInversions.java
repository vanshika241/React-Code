class Solution {
    
    static int merge(int arr[], int low,int mid , int high){
        int i = low;
        int j = mid+1;
        int cnt =0;
        ArrayList<Integer> temp = new ArrayList<>();
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                cnt += mid+1-i;
                temp.add(arr[j]);
                j++;
            }
        }
        
        while(i<=mid){
           temp.add(arr[i]);
              i++; 
        }
        while(j<=high){
           temp.add(arr[j]);
                j++; 
        }
        
        for(int idx=low;idx<=high;idx++){
            arr[idx] = temp.get(idx-low);
        }
        return cnt;
    }
    static int mergeSort(int arr[], int low, int high){
        if(low>=high){
            return 0;
        }
        int cnt = 0;
        int mid = low+(high-low)/2;
        cnt += mergeSort(arr,low,mid);
        cnt += mergeSort(arr,mid+1,high);
        cnt += merge(arr,low,mid,high);
        return cnt;
        
    }
    
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr,0,arr.length-1);
        
    }
}
