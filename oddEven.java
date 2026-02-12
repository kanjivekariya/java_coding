import java.util.Scanner;

public class oddEven {
    public static boolean even(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(even(num));
        sc.close();
    }
}
