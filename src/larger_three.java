import java.util.Scanner;

public class larger_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num :");
        int a = sc.nextInt();
        System.out.println("Enter the second num :");
        int b = sc.nextInt();
        System.out.println("Enter the tjhird num :");
        int c = sc.nextInt();
        if(a > b){
            if(a>c){
                System.out.println("A is greater than all the number");
            } else {
                System.out.println("C is greater than all the number");
            }
        } else {
            if(b>c){
                System.out.println("B is greater than all the number");
            } else {
                System.out.println("C is greater than all the number");
            }
        }
    }
}
