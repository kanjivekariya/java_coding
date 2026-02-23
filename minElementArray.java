public class minElementArray {
    public static int min(int[] ar)
    {
        int min=ar[0];
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] ar={5,1,2,3,4,12,-1};
        System.out.print(min(ar));
    }
}
