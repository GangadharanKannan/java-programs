import java.util.Scanner;

public class grade_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Grade :");
        String grade = sc.nextLine();
        switch (grade) {
            case "O":
                System.out.println("Outstanding");
                break;
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Average");
                break;
            case "C":
                System.out.println("Need Practice");
                break;
            default:
                System.out.println("PLease enter the correct grade");
        }
    }
}
