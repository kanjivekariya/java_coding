public class longestContingousLength {
    public static int longestSubarray(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,2,2,2,2};
       System.out.println(longestSubarray(ar, 10)); 
    }
}
