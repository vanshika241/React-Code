 int maxSubarraySum(int[] arr) {
      int n = arr.length;
      int maxi = arr[0];
      int sum = arr[0];
      for(int i=1;i<n;i++){
          sum= Math.max(sum+arr[i],arr[i]);
          maxi = Math.max(sum,maxi);
      }
      return maxi;
    }
