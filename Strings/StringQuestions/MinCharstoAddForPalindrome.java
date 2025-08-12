class Solution {
    public int [] getLPS(String pat){
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
                if(pre == 0){
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
    public int minChar(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        StringBuilder curr = new StringBuilder(s);
        curr.append('#');
        curr.append(sb.reverse());
        
        
        int lps[] = getLPS(curr.toString());
        
        return s.length()-lps[curr.length()-1];
        
    }
}
