package MergeArrayInZigZagWay;

public class MergeArray {

    public static int[] mergeArray(int[] ar1,int[] ar2){
        int[] mergeArr=new int[ar1.length+ar2.length];
        int i=0,j=0,m=0;;
        while(i<ar1.length && j<ar2.length){
            mergeArr[m++]=ar1[i++];
            mergeArr[m++]=ar2[j++];
        }
        while(i<ar1.length){
            mergeArr[m++]=ar1[i++];
        }
        while(j<ar2.length){
            mergeArr[m++]=ar2[j++];
        }
        return mergeArr;
    }
    public static void main(String[] args) {
        int[] ar={1,3,5,7,9,11,12};
        int[] ar2 = {2,4,6,8,10};
        ar=mergeArray(ar, ar2);
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
}
