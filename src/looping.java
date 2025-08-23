import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int result = 0;
        int digit = 0;
        while (num > 0){
            digit = num%10;
            result = result*10 + digit;
            num = num/10;
        }
        System.out.println("the result is :"+result);
    }
}
