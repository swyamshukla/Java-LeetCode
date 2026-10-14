class Solution {
    public int reverse(int x) {
        
        long reverseDigit = 0; // 1234
        while(x!=0){
            int last= x%10;
            reverseDigit = reverseDigit*10 + last;
            x=x/10;
        }
        return (reverseDigit>= Integer.MAX_VALUE|| reverseDigit<= Integer.MIN_VALUE) ? 0 : (int)reverseDigit;

    }
}

/*
 loop -> 1
            last=4
            reverse=4
            x=123
 loop -> 2 
            last=3
            reverse= 40+

*/