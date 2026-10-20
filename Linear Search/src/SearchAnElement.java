public class SearchAnElement {
    public static void main(String[] args) {
        int [] arr = {12,34,1,9,47,21,11};
        System.out.println(searchAnElement(arr, 47));
    }

    static int searchAnElement(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index<arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}