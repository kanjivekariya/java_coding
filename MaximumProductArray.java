public class MaximumProductArray {
    public static int productArray(int[] ar)
    {
        for (int i = 0; i < ar.length; i++) {
            for(int j=i+1; j<ar.length; j++)
            {
                if(ar[j]<ar[i])
                    {
                        int temp=ar[i];
                        ar[i]=ar[j];
                        ar[j]=ar[i];
                    }
            }
        }
        int p1=ar[0]*ar[1]*ar[ar.length-1];
        int p2=ar[ar.length-1]*ar[ar.length-2]*ar[ar.length-3];
        return p1>p2?p1:p2;
    }
    public static void main(String[] args) {
        int[] ar={-120,-20,-19,1,2,3,4,5,6};
        int p1=productArray(ar);
        System.out.println(p1);


    }
}
