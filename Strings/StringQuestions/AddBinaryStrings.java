// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
       int n = s1.length();
       int m = s2.length();
       int i=n-1;
       int j = m-1;
       int carry = 0;
       int num1 =0;
       int num2= 0;
       StringBuilder sb = new StringBuilder("");
       while(i>=0 || j>=0 || carry >0){
          num1 = (i>=0) ?  s1.charAt(i)-'0':0;
          num2 = (j>=0) ?  s2.charAt(j)-'0':0;
           int sum = num1+num2+carry;
           sb.append(sum%2);
           carry = sum/2;
           if(i>=0)i--;
           if(j>=0)j--;
       }
       int k =0;
       sb = sb.reverse();
       while(k<sb.length() && sb.charAt(k)=='0'){
           k++;
       }
       return sb.toString().substring(k);
    }
}
