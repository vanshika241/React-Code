class Solution {
    public int myAtoi(String s) {
        // code here
        long num = 0;
        int sign = 1;
        s = s.trim();
        int n = s.length();
        if(n ==0)return 0;
        int i=0;
        if(s.charAt(0) == '-' ){
            sign = -1;
            i++;
        }
        while(i<n && s.charAt(i) == '0')i++;
        while(i<n && Character.isDigit(s.charAt(i))){
            long val = s.charAt(i)-'0';
            num = num*10+val;
            if(num*sign >Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(num*sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)num*sign;
    }
}
