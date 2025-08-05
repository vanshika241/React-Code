public int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int diff = arr[n-1]-arr[0];
        int min = arr[0];
        int max = arr[n-1];
        for(int i=0;i<n-1;i++){
            min = Math.min(arr[0]+k,arr[i+1]-k);
            max = Math.max(arr[i]+k,arr[n-1]-k);
            if(min<0)continue;
            diff = Math.min(diff,max-min);
        }
        return diff;
    }
