import java.util.ArrayList;

public class PickAndSkip {

    static void subset(int temp,int i,ArrayList<Integer> arr,int size,String nString){
        if(i==size){
            arr.add(temp);
            return;
        }
        int get=getNum(nString,i);
        subset(temp*10+get,i+1,arr,size,nString);
        subset(temp,i+1,arr,size,nString);
        
    }
    static int getNum(String digit,int i){
        int num= digit.charAt(i)-'0';
        return num;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();


        int num=3221;
        String nString=String.valueOf(num);
        int size= nString.length();
        subset(0, 0, arr,size,nString);
        System.out.println(arr);

        
    }
    
    
}