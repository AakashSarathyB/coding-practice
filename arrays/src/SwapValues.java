import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        int[] arr = {3,53,68,31,24,5,49};
        System.out.println("Before swap : "+Arrays.toString(arr));
        swap(arr, 2, 5);
        System.out.println("After swap : "+Arrays.toString(arr));
    }

    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
