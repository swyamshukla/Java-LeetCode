public class Reverse {
    

    int reverse(int og , int res){
        if(og==0) return  res;
        int last = og%10;
        og=og/10;
        res = res*10 +last;
        return reverse(og, res);
    }



    public static void main(String[] args) {
        Reverse r = new Reverse();
        int result = r.reverse(-456, 0);
        System.err.println(result);
    }
}
