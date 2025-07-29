 public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = mat1.length;
        int q = mat2[0].length;
        int p = mat1[0].length;
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<q;j++){
                ans.get(i).add(0);
            }
        }
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<q;k++){
                    int val = ans.get(i).get(j)+mat1[i][k]*mat2[k][j];
                    ans.get(i).set(j,val);
                }
            }
        }
        return ans;
    }
