import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner enterTemp = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("Enter temperature");
            String temp = enterTemp.nextLine();
            switch (temp) {
                case "High":
                    System.out.println("Sunblock may be needed.");
                    break label;
                case "Low":
                    System.out.println("A coat may be needed.");
                    break label;
                case "Humid":
                    System.out.println("It's muggy!");
                    break label;
            }

        }
    }
}
