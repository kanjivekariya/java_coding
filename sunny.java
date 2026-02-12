
import java.util.*;

class sunny {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int i = 1;
        int flag = 0;
        while (i <= (n + 1) / i) {
            if (i == (n + 1) / i && i * i == (n + 1)) {
                flag = 0;
                break;
            } else {
                flag++;
            }
            i++;
        }
        sc.close();
        System.out.print(flag > 0 ? "Not sunny number" : "sunny number");
    }
}
