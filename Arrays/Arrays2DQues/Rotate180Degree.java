public void rotateMatrix180(int[][] mat) {
        // code here
        int n  = mat.length;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[n-1-i][j];
                mat[n-1-i][j] = temp;
            }
        }
        
        for(int i=0;i<n;i++){
            revRow(mat[i],0,n-1);
        }
    }
