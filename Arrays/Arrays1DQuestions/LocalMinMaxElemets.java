        //Local Min and Max Sequence ordering
        public ArrayList<Integer> extractPoints(int arr[]){
            int n = arr.length;
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(arr[0]);
            //non consecutive
            for(int i=1;i<n;i++){
                if (arr[i] != arr[i-1]) {
                    curr.add(arr[i]);
                }
            }
            if (curr.size()==1) {
                return curr;
            }

            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(curr.get(0));
            for(int i=1;i<curr.size()-1;i++){
                int prev = curr.get(i-1);
                int next = curr.get(i+1);
                int el = curr.get(i);
                if ((el>prev && el>next) || (el<prev && el<next)  ) {
                    ans.add(el);
                }
            }
            
            if (ans.get(0) != curr.get(curr.size()-1)) {
                ans.add(curr.get(curr.size()-1));
            }

            return ans;
        }
