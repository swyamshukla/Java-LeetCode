class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()) return "";

        HashMap<Character, Integer> tMap = new HashMap<>();
        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();

        int left = 0;
        int formed = 0;
        int required = tMap.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++){

            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if(tMap.containsKey(c) &&
               window.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }

            while(formed == required){

                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if(tMap.containsKey(leftChar) &&
                   window.get(leftChar) < tMap.get(leftChar)) {
                    formed--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}