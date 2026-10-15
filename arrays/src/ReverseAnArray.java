import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {3,53,68,31,24,5,49};
        System.out.println("The array before reversing : "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("The array after reversing : "+Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
