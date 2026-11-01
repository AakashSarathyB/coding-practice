import java.util.Arrays;

public class ConcatenationInArray {
    //https://leetcode.com/problems/concatenation-of-array/
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for(int i=0; i<nums.length; i++){
            result[i] = result[i+nums.length] = nums[i];
        }
        return result;
    }
}
