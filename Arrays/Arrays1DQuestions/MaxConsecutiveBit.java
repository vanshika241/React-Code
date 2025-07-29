    public int maxConsecBits(int arr[]){
        int n = arr.length;
        int maxi = 0;
        for(int i=0;i<n;i++){
            int cnt = 0;
            if (arr[i] == 0) {
                while (i<n && arr[i] == 0) {
                    cnt++;
                    i++;
                }
                maxi  = Math.max(maxi, cnt);
                i--;
            }
            else{
                while (i<n && arr[i] == 1) {
                    cnt++;
                    i++;
                }
                maxi  = Math.max(maxi, cnt);
                i--;
            }
        }
        return maxi;
    }
