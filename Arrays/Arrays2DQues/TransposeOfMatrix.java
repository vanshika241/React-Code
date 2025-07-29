//Transpose of matrix 
     public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        int n = mat.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<n;j++){
                ans.get(i).add(0);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               ans.get(j).set(i,mat[i][j]);
            }
        }
        return ans;
    }
