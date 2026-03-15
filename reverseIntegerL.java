import java.util.Scanner;

public class reverseIntegerL {
    public static Long reverse(int x) {
        Long reverse=0L;
        boolean neg=x<0?true:false;
        if(neg) {
            x=x*-1;

        }
        while(x>0){
            reverse=reverse*10+x%10;
            x/=10;
        }
        return neg==true?reverse*-1:reverse;
    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        System.out.println(reverse(x));
        sc.close();
    }
}
