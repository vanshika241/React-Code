        //Rotate Array Clockwise
        public void rotateClockwise(int arr[], int k){
            int n = arr.length;
            k = k%n;
            if(k == 0)return;
            rev(arr, 0, n-1);
            rev(arr, 0, k-1);
            rev(arr, k, n-1);

        }

