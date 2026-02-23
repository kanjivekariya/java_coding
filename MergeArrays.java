public class MergeArrays {
    public static int[] MergeArray(int[] ar1, int[] ar2) {
        int[] mar = new int[ar1.length + ar2.length];
        int i = 0;
        int m;

        for (i = 0; i < ar1.length; i++) {

            mar[i] = ar1[i];

        }
        m=i;
        for (int j = 0; j < ar2.length; j++) {
            mar[m]=ar2[j];
            m++;
        }
        return mar;

    }

    public static void main(String[] args) {
        int[] ar1 = { 1, 2, 3 };
        int[] ar2 = { 4, 5, 6 };
        int[] mar = MergeArray(ar1, ar2);
        for (int i = 0; i < mar.length; i++) {
            System.out.println(mar[i]);
        }
    }
}
