public class Level2 {
    public static boolean playLevel() {
        System.out.println("\nLevel 2");
        System.out.println("Addition problems but harder");
        int score = 0;
        int lives = 3;
        
        while (score < 5) {
            // Generate two one-digit numbers.
            int a = Data.randomInt(0, 9);
            int b = Data.randomInt(0, 9);
            int correctAnswer = a + b;
            System.out.println("\nWhat is " + a + " + " + b + " ?");
            
            boolean answeredCorrectly = false;
            // Allow up to 2 attempts per problem.
            for (int attempt = 1; attempt <= 2; attempt++) {
                int userAnswer = Data.getIntInput("Your answer: ");
                if (userAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                    lives = 3;  // Reset lives on a correct answer.
                    answeredCorrectly = true;
                    break;
                } else {
                    if (attempt == 1) {
                        System.out.println("Incorrect. Try again.");
                    }
                }
            } // if answered wrong
            if (!answeredCorrectly) {
                lives--;
                System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
                System.out.println("Lives remaining: " + lives);
                // if you lost the game
                if (lives == 0) {
                    System.out.println("Game over! But you suck a little less");
                    return false;
                }
            }
            System.out.println("Current score: " + score);
        }
        System.out.println("Congratulations! Almost there!");
        return true;
    }
}
