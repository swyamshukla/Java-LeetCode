class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int left=0;

        int right=0;
        String temp="";
        while(right<s.length()){

            temp = s.substring(left,right+1);

            if(temp.contains("a")){
                if(temp.contains("b")){
                    if(temp.contains("c")){
                        while(temp.contains("a")&&temp.contains("b")&&temp.contains("c")){
                            temp=s.substring(++left,right+1);
                            count+= s.length()-right;
                        }
                    }
                }
            }


            right++;

        }

        return count;
    }
}