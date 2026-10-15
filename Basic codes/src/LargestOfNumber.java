import java.util.Scanner;

public class LargestOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max;
        if(a > b){
            max = a;
        } else {
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);
        max = Math.max(a, Math.max(b,c));
        System.out.println(max);
    }
}
