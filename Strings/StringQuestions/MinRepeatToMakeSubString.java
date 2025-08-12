class Solution {
     public int[] getLPS(String pat){
        int n = pat.length();
        int pre = 0;
        int suff = 1;
        int lps[] = new int[n];
        lps[0] = 0;
        while(suff<n){
            if(pat.charAt(pre) == pat.charAt(suff)){
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
        return lps;
        
    }
    boolean search(String pat, String txt) {
        // code here

        int lps[] = getLPS(pat);
        int f = 0;
        int s = 0;
        int n = txt.length();
        int m = pat.length();
        while(f<n){
            if(txt.charAt(f) == pat.charAt(s) ){
                s++;
                f++;
                if(s == m){
                    return true;
                }
            }
            else{
                if(s == 0){
                    f++;
                }
                else{
                    s = lps[s-1];
                }
            }
        }
        return false;
    } 
    public int minRepeats(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int cnt = 1;
        StringBuilder sb = new StringBuilder(s1);
        while(sb.length()<s2.length()){
            sb.append(s1);
            cnt++;
        }
        if(search(s2,sb.toString()) == true){
            return cnt;
        }
            sb.append(s1);
            cnt++;
        if(search(s2,sb.toString()) == true){
            return cnt;
        }
   
        return -1;
        
    }
};
