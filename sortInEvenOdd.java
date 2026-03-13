public class sortInEvenOdd {
    public static void sortOddEven(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[i]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] % 2 == 0) {
                    if (ar[i] % 2 == 0 && ar[i] < ar[j]) {
                        int temp = ar[j];
                        ar[j] = ar[i + 1];
                        ar[i + 1] = temp;
                    } else {
                        int temp = ar[j];
                        ar[j] = ar[i];
                        ar[i] = temp;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] ar = { 17,20,-12,10,-9,27};
        sortOddEven(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }

    }
}
