import java.util.Arrays;

public class RunningSum {
    //https://leetcode.com/problems/running-sum-of-1d-array/
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums){
//        int[] result = new int[nums.length];
//        for(int i=0; i<nums.length; i++){
//            int sum = 0;
//            for(int j=i; j>=0; j--){
//                sum += nums[j];
//            }
//            result[i] = sum;
//        }
//        return result;

        //best solution
        for(int i = 1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
