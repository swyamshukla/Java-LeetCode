class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.length()==0) return true;

        int sLeft=0;
        int tLeft=0;
        while(tLeft<t.length() && sLeft<s.length()){
            if(s.charAt(sLeft)==t.charAt(tLeft)) sLeft++;
            tLeft++;
        }
        return sLeft==s.length()? true: false;
    }
}