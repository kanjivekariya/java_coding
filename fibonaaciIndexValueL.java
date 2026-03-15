import java.util.Scanner;

public class fibonaaciIndexValueL {

    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        int x=0, nxt=1,sum=x+nxt;
        for(int i=1; i<=n; i++){
            sum=x+nxt;
            x=nxt;
            nxt=sum;
        }
        return x;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Index : ");
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
}
