public class Demo {
    public static void main(String[] args) {
        System.out.println("A test to see if you are stupid :D");
        
        // Level 1: Addition with sum < 10.
        if (!Level1.playLevel()) {
            System.out.println("Stick to roblox");
            return;
        }
        
        // Level 2: Addition with any one-digit numbers.
        if (!Level2.playLevel()) {
            System.out.println("Hit the books");
            return;
        }
        
        // Level 3: Subtraction with non-negative result.
        if (!Level3.playLevel()) {
            System.out.println("So close yet so far");
            return;
        }
        
        System.out.println("Ayeeee you aren't stoopid");
    }
}

