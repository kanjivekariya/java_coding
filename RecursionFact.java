import java.util.Scanner;

public class RecursionFact {
    public static void print(int n, int fact) {

        if (n == 0) {
            System.out.println(fact);
            return;
        }

        fact *= n;
        print(n - 1, fact);
        // System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        print(n, 1);
        sc.close();
    }
}
