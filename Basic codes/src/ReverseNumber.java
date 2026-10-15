import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to reverse : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = 0;
        while(number > 0){
            int reminder = number % 10;
            result = result * 10 + reminder;
            number /= 10 ;
        }
        System.out.println(result);
    }
}
