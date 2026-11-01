public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-23, -17, -8, 0, 4, 16, 35, 58, 63, 66, 89, 93};
        int[] arr = {97, 88, 70, 57, 51, 24, 11, 7, 3, -12, -45};
        System.out.println(orderAgnosticBinarySearch(arr, -12));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find is ascending or descing array
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
