import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        byte count = 0;
        int result = 0;
        int digits = 0;
        int temp = num;
        while (temp > 0){
            temp = temp / 10;
            count++;
        }
        temp = num;
        for (int i = 0; i < count; i++){
            digits = temp % 10;
            result += Math.pow(digits, count);
            temp = temp/10;
        }
        if (num == result){
            System.out.println("it is a armstrong number");
        } else {
            System.out.println("not");
        }
    }
}
