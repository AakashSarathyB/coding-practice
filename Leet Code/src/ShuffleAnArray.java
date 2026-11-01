import java.util.Arrays;

public class ShuffleAnArray {
    //https://leetcode.com/problems/shuffle-the-array/
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int resPos = 0;
        for(int i=0; i<n; i++){
            result[resPos] = nums[i];
            resPos++;
            result[resPos] = nums[n+i];
            resPos++;
        }
        return result;
    }
}
