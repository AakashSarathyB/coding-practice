public class MinValueInArray {
    public static void main(String[] args) {
        int[] arr = {3,53,68,31,24,2,5,49};
        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr){
        int minValue = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
