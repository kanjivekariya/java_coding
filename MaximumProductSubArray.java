public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,prod=1;
        System.out.println(max);
        if(nums.length==1){
            return nums[0];
        }
        
        for(int i=0; i<nums.length; i++){
            
                prod*=nums[i];
                if(prod>max){
                    max=prod;
                    System.out.println(max);
                }
                if(prod<=0){
                    prod=1;
                    
                }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ar = {-3,-1,-1};
        System.out.println(maxProduct(ar));
    }
}
