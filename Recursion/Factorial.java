package Recursion;
import java.util.Scanner;

public  class Factorial{


    int fact(int num){
        if(num==0 || num==1) return 1;
        return num * fact(num-1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(obj.fact(num));
        sc.close();
    }
}