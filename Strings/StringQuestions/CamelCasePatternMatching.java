class Solution {
    public List<String> camelCase(String[] arr, String pat) {
        // code here
        List<String> ans = new ArrayList<>();
        for(String str : arr){
            int f = 0;
            int s = 0;
            while(f<str.length() && s<pat.length()){
                if(Character.isLowerCase(str.charAt(f))){
                    f++;
                    continue;
                }
                if(str.charAt(f) != pat.charAt(s)){
                    break;
                }
                else{
                    f++;
                    s++;
                }
            }
            if(s == pat.length()){
                ans.add(str);
            }
        }
        return ans;
    }
}
