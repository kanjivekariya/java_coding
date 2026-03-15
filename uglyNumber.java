import java.util.*;

public class uglyNumber {
    public static boolean uglynumber(int n) {
        int[] ar = { 2, 3, 5 };
        int m = 0;

        //
        if(n<=0)
            return false;
        while (m < ar.length) {
            System.out.println("m = " + ar[m]);
            if (n == 1)
                return true;
            else if (n % ar[m] == 0) {
                n /= ar[m];
            } else {
                m++;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(uglynumber(n));
        sc.close();
    }
}
