class Solution {
    public void sort012(int[] arr) {
        // code here
        //Arrays.sort(arr);
        
        //Optimal - Pointers 
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else{
                mid++;
            }
        }
    
    }
}
