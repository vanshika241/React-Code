        //Missing and Repeating
        public ArrayList<Integer> findTwoElements(int arr[]){
            int n = arr.length;
            int i=0;
            while (i<n) {
                int correctIdx = arr[i]-1;
                if (arr[i]>=1 && arr[i]<=n && arr[i] != arr[correctIdx]) {
                    int temp = arr[i];
                    arr[i] = arr[correctIdx];
                    arr[correctIdx] = temp;
                }
                else{
                    i++;
                }
            }

            ArrayList<Integer> ans = new ArrayList<>();
            for(int idx = 0;idx<n;idx++){
                if (arr[idx] != idx+1) {
                    ans.add(arr[idx]);
                    ans.add(idx+1);
                }
            }
            return ans;

        }

