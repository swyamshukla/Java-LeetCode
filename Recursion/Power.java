package Recursion;

public class Power {
    
    static int pow(int a, int b){
        if (b==0) return 1;
        return a *pow(a, b-1);

    }

    static int pow2(int a, int b){
        if (b==0) return 1;
        int half = pow(a,b/2);
        if (b%2==0) return half * half;
        return a * half * half;

    }

    public static void main(String[] args) {

        System.out.println(pow(2, 3));
        System.out.println(pow2(2, 3));

        
    }
}
