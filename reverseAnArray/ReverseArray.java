package reverseAnArray;

public class ReverseArray {
    
    public static int[] reverseArray(int[] ar){
        int left=0,right=ar.length-1;
        while(left<right){
            int temp = ar[left];
            ar[left]=ar[right];
            ar[right]=temp;
        }
        return ar;
    }
    public static void main(String[] args) {
        int[] ar={1,2,4,5,7,9};
        ar=reverseArray(ar);
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }

    }
}
