public void rev(int arr[], int left, int right){
            while (left<right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        public void reverseInGroups(int arr[], int k){
            int n = arr.length;
            
            if (k == 0 || k == 1) {
                return;
            }
            if(k>n){
                rev(arr, 0, n-1);
                return;
            }
            for(int i=0;i<=n-k;i+=k){
                int left = i;
                int right = Math.min(n-1, i+k-1);
                while (left<right) {
                   int temp = arr[left];
                   arr[left] = arr[right];
                   arr[right] = temp;
                   left++;
                   right--; 
                }
            }
        }
