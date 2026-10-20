import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr =   {{23,44,12},
                        {97,13,67,44},
                        {73,4}};
        System.out.println(Arrays.toString(searchIn2DArray(arr, 67)));
    }

    static int[] searchIn2DArray(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){
               if(arr[i][j] == target){
                   return new int[] {i,j};
               }
           }
        }
        return new int[]{0,0};
    }
}
