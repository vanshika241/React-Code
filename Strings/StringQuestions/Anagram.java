class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 != n2)return false;
        int freq[] = new int[26];
        for(int i=0;i<n1;i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<n1;i++){
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i] != 0)return false;
        }
        return true;
    }
    
}
