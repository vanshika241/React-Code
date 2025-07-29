public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;
        while(startRow <=endRow && startCol <=endCol){
            for(int j=startCol;j<=endCol;j++){
                ans.add(mat[startRow][j]);
            }
            
            for(int i=startRow+1;i<=endRow;i++){
                ans.add(mat[i][endCol]);
            }
            if(startRow < endRow){
                for(int j=endCol-1;j>=startCol;j--){
                    ans.add(mat[endRow][j]);
                }
            }
            if(startCol<endCol){
                for(int i=endRow-1;i>startRow;i--){
                    ans.add(mat[i][startCol]);
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return ans;
    }

