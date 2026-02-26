public class RotateArray {
    public static void reversearray(int[] ar,int i,int j)
    {
        int temp=ar[i];
        while (i<j) {
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotateArray(int[] ar,int k)
    {
        reversearray(ar, 0,ar.length-1);
        reversearray(ar, 0,k-1);
        reversearray(ar, k, ar.length-1);
        
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        rotateArray(ar,2);
        System.out.println("Kanji Vekariya");
        for(int i=0; i<ar.length; i++)
        {
            System.out.println(ar[i]+ " ");
        }
    }
}
