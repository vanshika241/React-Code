  //Stock Buy and Sell – Max one Transaction Allowed
        public int maximumProfit2(int prices[]) {
            int n = prices.length;
            int maxProfit = 0;
            int min = prices[0];
            for(int i=1;i<n;i++){
                if (prices[i]-min>0) {
                    maxProfit = Math.max(maxProfit, prices[i]-min);
                    min = Math.min(min, prices[i]);
                }
            }
            return maxProfit;
        }
