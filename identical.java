public class identical {
    public static boolean arrayide(int[] a1,int[] a2)
    {
    
            for(int i=0; i<a1.length; i++)
            {
                if(a1[i]!=a2[i])
                    return false;
            }
        
        return true;
       
    }
    public static void main(String[] args) {
        int a1[]={1,2,3};
        int a2[]={1,2,3};
        System.out.println(arrayide(a1, a2));
    }
}
