public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-23, -17, -8, 0, 4, 16, 35, 58, 63, 66, 89, 93};
        System.out.println(binarySearch(arr, 58));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
