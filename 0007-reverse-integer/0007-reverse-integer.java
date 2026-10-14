class Solution {
    public int reverse(int x) {
        return recursion(x,0);
    }
    static int recursion(int x,long reverse){
        if(reverse>Integer.MAX_VALUE  || reverse<Integer.MIN_VALUE) return 0;
        if(x==0) return (int)reverse;

        reverse = reverse*10 + x%10;
        return recursion(x/10,reverse);
    }

    static int loopReverse(int x){

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