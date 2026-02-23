public class SumOfArray {
    public static void sumArray(int[] ar) {
        int sum;
        for (int i = 0; i < ar.length; i++) {
            sum = 0;
            for (int j = 0; j < ar.length; j++) {
                if (i != j) {
                    sum += ar[j];
                }
            }
            System.out.println(sum);

        }
    }

    public static void main(String[] args) {
            int ar[]={1,2,3,4,5};
            sumArray(ar);
    }
}
