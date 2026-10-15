import java.util.Scanner;

public class Fibnoci {
    public static void main(String[] args) {
        System.out.println("Enter the inp value : ");
        Scanner input = new Scanner(System.in);
        int inp = input.nextInt();
        int nthValue = 0;
        int start = 0;
        int nextNum = 1;
        if(inp == 1){
            System.out.println("Value is : " + start);
        }
        if(inp == 2){
            System.out.println("Value is : " + nextNum);
        }
        for(int n = 3; n <= inp; n++){
            nthValue = start + nextNum;
            start = nextNum;
            nextNum = nthValue;
        }
        System.out.println("Value is : " + nthValue);

    }
}
