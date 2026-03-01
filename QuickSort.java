public class QuickSort {
    public static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static int getPivotIndex(int[] ar, int l, int h) {
        int pi = ar[h];
        int t = l;
        while (l < h) {
            if (ar[l] < pi) {
                swap(ar, l, t);
                t++;
            }
            l++;
        }

        swap(ar, t, h);
        return t;
    }

    public static void quickSort(int ar[], int l, int h) {
        if (l < h) {
            int pi = getPivotIndex(ar, l, h);
            quickSort(ar, l, pi - 1);
            quickSort(ar, pi + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] ar = { 50, 1, 40, 56, 23, 57, 12 };
        quickSort(ar, 0, ar.length - 1);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
