import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value 9of b :");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println(":Enter the choice (add/sub/mul/div) :");
        String choice = sc.nextLine();

        switch (choice) {
            case "add":
                System.out.println("Add of two number :" + (a+b));
                break;
            case "sub":
                System.out.println("sub of two number :" + (a-b));
                break;
            case "mul":
                System.out.println("Mul of two number :" + (a*b));
                break;
            case "div":
                System.out.println("Div of two number :" + ((float)a/ (float)b));
                break;
            default:
                System.out.println("Plz enter the correct choice");
        }
    }
}
