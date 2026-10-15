import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to save in array :");
        Scanner input = new Scanner(System.in);
        //Initialize array using new keyword
        int[] arr1 = new int[3];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        //Direct values can be sent while creating an array
        int[] arr2 = {12,45,38,65,31};
        System.out.println(Arrays.toString(arr2));

        //2D arrays
        System.out.println("Enter values to show in 3*3 2D array :");
        Scanner input2 = new Scanner(System.in);
        int[][] arr3 = new int[3][3]; //first row and then column
        for(int i=0; i<arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                arr3[i][j] = input2.nextInt();
            }
        }
        for(int[] arr : arr3){
            System.out.println(Arrays.toString(arr));
        }


    }
}