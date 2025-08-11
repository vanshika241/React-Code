class Solution {
    public String findLargest(int[] arr) {
      int n = arr.length;
      String str[] = new String[n];
      for(int i=0;i<n;i++){
          str[i] = String.valueOf(arr[i]);
      }
      
      Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
      if(str[0].equals("0"))return "0";
      StringBuilder ans = new StringBuilder("");
      for(String s:str){
          ans.append(s);
      }
      return ans.toString();
    }
}
