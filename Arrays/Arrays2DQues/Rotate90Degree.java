
    public void revRow(int arr[], int left, int right){
        while (left<right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public  void rotateMatrix(int mat[][]){
        int n = mat.length;
        for(int i=0;i<n;i++){
            revRow(mat[i], 0, n-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

    }
