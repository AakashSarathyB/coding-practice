import java.util.Scanner;

public class CalculateCount {
    public static void main(String[] args) {
        System.out.println("Enter the number to validate :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); //23536373
        System.out.println("Enter the digit to calculate :");
        int digit = input.nextInt(); //3
        int count = 0;
        while (number > 0){
            int lastDigit = number % 10;
            if(lastDigit == digit){
                count++;
            }
            number /= 10;
        }
        System.out.println("The count of the "+ digit + " is "+ count);
    }
}
