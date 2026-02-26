public class addOneInArray {
    public static int[] addOneArray(int[] ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] < 9) {
                ar[i]++;
                return ar;
            } else {
                ar[i] = 0;
            }

        }
        int[] nar=new int[ar.length+1];
            nar[0]=1;
            return nar;
    }

    public static void main(String[] args) {
        int[] ar = { 8, 9, 9, 9 };
        int[] mar = addOneArray(ar);
        for (int i = 0; i < mar.length; i++) {
            System.out.print(mar[i] + " ");
        }
    }
}
