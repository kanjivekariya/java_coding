public class missingElement {
    public static void missingElement1(int ar[])
    {
        int dif=ar[0]-ar[1];
        int j=1;
        for(int i=0; i<ar.length-1; i++)
        {
            
            if(ar[i]-ar[j]!=dif)
            {
                System.out.println(ar[i]);
            }
            j++;
        }
    }
    public static void main(String[] args) {
        int[] ar = {2,4,6,10} ;
        missingElement1(ar);
        
    }
}
