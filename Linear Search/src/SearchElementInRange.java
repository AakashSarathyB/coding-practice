public class SearchElementInRange {
    public static void main(String[] args) {
        int [] arr = {12,34,1,9,47,21,11};
        System.out.println(searchInRange(arr, 47,1,5));
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
