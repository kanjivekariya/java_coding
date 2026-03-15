package MiNElementInArray;

public class MinElement {
    public static int minElement(int[] ar){
        int min=ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] ar={12,45,789,9,90};
        System.out.println(minElement(ar));
    }
}
