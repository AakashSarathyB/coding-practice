public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr =   {{23,44,12},
                {97,13,67,44},
                {73,4, 101}};
        System.out.println(maxElementIn2DArray(arr));
    }

    static int maxElementIn2DArray(int[][] arr){
        int max = 0;
        for(int[] rowArr : arr){
            for(int value : rowArr){
                if(value > max){
                    max = value;
                }
            }
        }
        return max;
    }
}
