import java.util.Arrays;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr = {3,53,68,31,24,5,49};
        System.out.println("The arrays is : "+ Arrays.toString(arr));
        System.out.println("The max value is : "+ findMaxValue(arr));
        System.out.println("The max value withing the rage 3 to 6 index is "+ maxWithingRange(arr, 3, 6));
    }

    //find the mx value in a array
    static int findMaxValue(int[] arr) {
        int max = 0;
        for(int val : arr){
            if(val > max){
                max = val;
            }
        }
        return max;
    }

    //find the max value withing a range of an array
    static int maxWithingRange(int[] arr, int start, int end){
        int max = 0;
        for(int i=start; i<=end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
