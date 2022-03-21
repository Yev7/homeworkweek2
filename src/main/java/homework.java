import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner enterPassword = new Scanner(System.in);  // Create a Scanner object
        while (true) {
            System.out.println("Enter Password");
            String passCode = enterPassword.nextLine();
            if (passCode.equals("Password")) {
                System.out.println("Logged in");
                break;
            } else {
                System.out.println("Enter Password");
                System.out.println("Try again.");
            }
        }
    }
}