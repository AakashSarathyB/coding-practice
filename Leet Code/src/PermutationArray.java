import java.util.Arrays;

public class PermutationArray {
    //https://leetcode.com/problems/build-array-from-permutation/
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
        //best approach is through recursive
        //int[] result = new int[arr.length];
        //System.out.println(Arrays.toString(ans(result,0,arr)));
    }

    static int[] buildArray(int[] nums){
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }

    //best approach is through recursive
    static int[] ans(int[] ans, int i, int[] nums){
        if(i == nums.length){
            return ans;
        }
        ans[i] = nums[nums[i]];
        return ans(ans, ++i, nums);
    }
}
