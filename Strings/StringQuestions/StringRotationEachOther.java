class Solution {
    public  int[] getLPS(String pat){
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
    public boolean areRotations(String p, String q) {
        // code here
        StringBuilder sb = new StringBuilder(p);
       sb.append(p);
       int lps[] = getLPS(q);
        int f = 0;
        int s = 0;
        int n = sb.length();
        int m = q.length();
        while(f<n && s<m){
            if(sb.charAt(f) == q.charAt(s) ){
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
}
