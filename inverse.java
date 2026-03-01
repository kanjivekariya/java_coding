public class inverse {
    public static void inverseArray(int[] ar1, int[] ar2) {
        // for (int i = 0; i < ar1.length; i++) {
        //     for (int j = 0; j < ar2.length; j++) {
        //         if (ar1[i] + ar2[j] == 0) {
        //             System.out.println(ar1[i]);
        //         }
        //     }
        // }
        
        int i = ar1.length - 1, j = 0, diff = ar1[i] + ar2[j];
        while (i >= 0) {
            diff = ar1[i] + ar2[j];
            if (diff == 0) {
                System.out.print(ar1[i] + " ");
                i--;
                j++;
            } else if (diff < 0) {
                j++;
            } else if (diff > 0) {
                i--;
            }

        }

    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13 };
        int[] ar2 = { -13, -12, -7, -5, -4, -3, 1, 2, 3, 4, 5 };
        inverseArray(ar, ar2);
    }
}
