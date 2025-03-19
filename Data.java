import java.util.Random;
import java.util.Scanner;

public class Data {
    public static Scanner scanner = new Scanner(System.in);
    private static Random rand = new Random();

    // Returns a random integer between min and max
    public static int randomInt(int min, int max) {
        return rand.nextInt(max - min + 1) + min;
    }

    // Gets an integer input from the user
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number before i input my fist into your face");
            scanner.next(); // discard invalid input
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }
}

