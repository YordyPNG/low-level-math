public class Level3 {
    public static boolean playLevel() {
        System.out.println("\nWelcome to Level 3");
        System.out.println("Subtraction problems");
        int score = 0;
        int lives = 3;
        
        while (score < 5) {
            // Generate two numbers and makes sure it is a non-negative result
            int a = Data.randomInt(0, 9);
            int b = Data.randomInt(0, 9);
            if (a < b) {
                // Swap to guarantee a - b is non-negative
                int temp = a;
                a = b;
                b = temp;
            }
            int correctAnswer = a - b;
            System.out.println("\nWhat is " + a + " - " + b + " ?");
            
            boolean answeredCorrectly = false;
            // Allow up to 2 attempts per problem
            for (int attempt = 1; attempt <= 2; attempt++) {
                int userAnswer = Data.getIntInput("Your answer: ");
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                    lives = 3;  // Reset lives on a correct answer
                    answeredCorrectly = true;
                    break;
                } else {
                    if (attempt == 1) {
                        System.out.println("Incorrect. Try again");
                    }
                }
            } // if the answer is wrong
            if (!answeredCorrectly) {
                lives--;
                System.out.println("Incorrect The correct answer is " + correctAnswer + ".");
                System.out.println("Lives remaining: " + lives);
                // if you lose the game
                if (lives == 0) {
                    System.out.println("Game over! Never gamble");
                    return false;
                }
            }
            System.out.println("Current score: " + score);
        }
        System.out.println("You are finally done, good stuff");
        return true;
    }
}

