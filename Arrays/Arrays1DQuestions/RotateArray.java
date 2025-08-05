public  static void rev(int arr[], int start, int last){
        while (start<last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }
        static void rotateArr(int arr[], int d) {
            int n = arr.length;
            d = d%n;
            if (d == 0) {
                return;
            }
            rev(arr, 0, n-1);
            rev(arr, 0, d);
            rev(arr, d+1, n-1);
    }
