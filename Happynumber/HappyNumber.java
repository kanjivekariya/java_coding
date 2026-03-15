package Happynumber;

import java.util.Scanner;

public class HappyNumber {
    public static boolean isHappy(int n){
        do{
            int sum=0;
            while(n>0){
                int rm=n%10;
                sum+=rm*rm;
                n/=10;
            }
            n=sum;
        }while(n>9);
        return n==1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :  ");
        int n=sc.nextInt();
        System.out.println(isHappy(n));
        sc.close();
    }
}
