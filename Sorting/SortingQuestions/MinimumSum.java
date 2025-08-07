import java.math.BigInteger;
class Solution {
    String minSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        if(n == 0)return "0";
        if(n == 1)return String.valueOf(arr[0]);
        StringBuilder  num1 = new StringBuilder();
         StringBuilder  num2 = new StringBuilder();

        for(int i=0;i<n;i++){
            if(i %2 ==0){
                num1.append(arr[i]);
            }
            else{
                 num2.append(arr[i]);
            }
        }
        BigInteger n1 = new BigInteger(num1.toString());
        BigInteger n2 = new BigInteger(num2.toString());
        return n1.add(n2).toString();
    }
}
