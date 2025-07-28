//First and Second Smallests
        public ArrayList<Integer> minAnd2ndMin(int[] arr) {
            ArrayList<Integer> ans = new ArrayList<>();
            int n = arr.length;
            int min = arr[0];
            int smin = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if (arr[i]<min) {
                    smin = min;
                    min = arr[i];
                }
                if(arr[i]>min && arr[i]<smin){
                    smin = arr[i];
                }
            }
            if (smin == Integer.MAX_VALUE) {
                ans.add(-1);
                return ans;
            }
             ans.add(min);
            ans.add(smin);
            return ans;
        }
