import time.time;
public class TwoSumArray {

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int i;
        for (i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    arr[0] = j;
                    arr[1] = j-i;
                    return arr;
                }

            }
        }

        return arr;
    }

    public static void main(String[] args) {
        long start = time.startTime();
        int[] arr = { 3, 2, 4, 9, 5, 7, 9 };
        arr = twoSum(arr, 10);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        long ExecutionTime=time.endTime(start);
        System.out.println(ExecutionTime+"/ms");
    }
}
