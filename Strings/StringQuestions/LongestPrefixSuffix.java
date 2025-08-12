class Solution {
    int getLPSLength(String s) {
        // code here
      int n = s.length();
      int lps[] = new int[n];
      int pre = 0;
      int suff = 1;
      while(suff<n){
          if(s.charAt(pre) == s.charAt(suff)){
              lps[suff] = pre+1;
              pre++;
              suff++;
          }
          else{
              if(pre ==0){
                  lps[suff] = 0;
                  suff++;
              }
              else{
                  pre = lps[pre-1];
                  
              }
          }
      }
      return lps[n-1];
        
    }
}
