class Solution {
    public int singleDigit(int n) {
        // code here
        if(n>=0 && n<=9)return n;
        int sum = 0;
        while(n>=10){
            sum =0;
           while(n>0){
                sum += n%10;
            n = n/10;
           }
           n = sum;
        }
        return sum;
    }
}
