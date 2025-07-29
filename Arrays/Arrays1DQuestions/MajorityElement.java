    //Majority Element - Moore Voting Algo help to find Largest element
    public int majorityElement(int arr[]){
        int n = arr.length;
        int cnt = 0;
        int el = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(cnt == 0){
                el = arr[i];
                cnt = 1;
            }
            else if (arr[i] == el) {
                cnt++;
            }
            else{
                cnt--;
            }
        }

        //verification
        cnt =0;
        for(int i=0;i<n;i++){
            if(arr[i] == el)cnt++;
        }
        if(cnt > n/2)return el;
        return -1;
    }
