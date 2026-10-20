public class EvenNumberDigits {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(evenNumberDigitsCount(nums));
    }

    static int evenNumberDigitsCount(int[] arr){
        int count = 0;
        if(arr.length == 0){
            return count;
        }
        for(int number : arr){
            if(isEvenDigits(number)){
                count++;
            }
        }
        return count;
    }

    static boolean isEvenDigits(int number){
        if(number == 0){
            return false;
        }
        int digitCount = countDigits(number);
        return digitCount % 2 == 0;
    }

    static int countDigits(int num){
        int digits = 0;
        if(num < 0){
            num *= -1;
        }
        while(num > 0){
            num /= 10;
            digits++;
        }
        return digits;
    }
}