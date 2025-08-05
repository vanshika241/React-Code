 //Stock Buy and Sell – Multiple Transaction Allowed
        public int maximumProfit(int prices[]) {
            int n = prices.length;
            int totalProfit = 0;
            for(int i=1;i<n;i++){
                if (prices[i]-prices[i-1]>0) {
                    totalProfit += prices[i]-prices[i-1];
                }
                else{
                    continue;
                }
            }
            return totalProfit;
        }
