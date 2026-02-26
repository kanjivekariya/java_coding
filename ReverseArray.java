public class ReverseArray {
    public static int[] reverseArray(int[] ar)
    {
        int j=ar.length-1;
        int temp;
        for(int i=0; i<ar.length/2; i++)
        {
            temp=ar[i];
            ar[i]=ar[j];
            ar[j--]=temp;
            
        }
        return ar;
    }
    public static void main(String[] args) {
        int[] ar= {1,2,3,4,5,6};
        ar=reverseArray(ar);
        for(int i=0; i<ar.length; i++)
        {
            System.out.print(ar[i]+ " ");
        }
    }
}
