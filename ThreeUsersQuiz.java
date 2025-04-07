package quizjava;

import java.util.Scanner;

public class QuizJava {

    public static void main(String[] args) {
        // Question in var
        String q1 = "What is love? \n"
                + "A. Her\n"
                + "B. Philo\n"
                + "C. All of the above\n"
                + "Answer: ";
        String q2 = "What is 5?\n"
                + "A. Integer\n"
                + "B. String\n"
                + "C. Double\n"
                + "Answer: ";
        String q3 = "What is L?\n"
                + "A. Integer\n"
                + "B. String\n"
                + "C. Character\n"
                + "Answer: ";
        String q4 = "What is Hello World?\n"
                + "A. Integer\n"
                + "B. String\n"
                + "C. Double\n"
                + "Answer: ";
        String q5 = "What is 2.0?\n"
                + "A. Integer\n"
                + "B. String\n"
                + "C. Double\n"
                + "Answer: ";
        String q6 = "What is 76?\n"
                + "A. Integer\n"
                + "B. String\n"
                + "C. Double\n"
                + "Answer: ";
        String q7 = "What is 3.0?\n"
                + "A. Integer\n"
                + "B. String\n"
                + "C. Double\n"
                + "Answer: ";
        String q8 = "What is Java?\n"
                + "A. Food\n"
                + "B. Language\n"
                + "C. Regine Velasquez\n"
                + "Answer: ";
        String q9 = "Example of int?\n"
                + "A. 5\n"
                + "B. 5.0\n"
                + "C. Integer\n"
                + "Answer: ";
        String q10 = "Example of String\n"
                + "A. None\n"
                + "B. 0.5\n"
                + "C. 5\n"
                + "Answer: ";

        // Correct answers
        char Qanswer1 = 'C';
        char Qanswer2 = 'A';
        char Qanswer3 = 'C';
        char Qanswer4 = 'B';
        char Qanswer5 = 'C';
        char Qanswer6 = 'A';
        char Qanswer7 = 'C';
        char Qanswer8 = 'B';
        char Qanswer9 = 'A';
        char Qanswer10 = 'A';

        Scanner userInput = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {
        // For user 1
        System.out.println("Quiz time!");
        System.out.print("State your name: ");
        String name1 = userInput.nextLine();
        
        int scoreUser1 = 0;
        
        scoreUser1 += askQuestion(q1, Qanswer1, userInput);
        scoreUser1 += askQuestion(q2, Qanswer2, userInput);
        scoreUser1 += askQuestion(q3, Qanswer3, userInput);
        scoreUser1 += askQuestion(q4, Qanswer4, userInput);
        scoreUser1 += askQuestion(q5, Qanswer5, userInput);
        scoreUser1 += askQuestion(q6, Qanswer6, userInput);
        scoreUser1 += askQuestion(q7, Qanswer7, userInput);
        scoreUser1 += askQuestion(q8, Qanswer8, userInput);
        scoreUser1 += askQuestion(q9, Qanswer9, userInput);
        scoreUser1 += askQuestion(q10, Qanswer10, userInput);
        
        System.out.println(name1 + "'s score is: " + scoreUser1 + " over 10");
        
        // For user 2
        userInput.nextLine(); // Consume the leftover newline
        System.out.print("State your name: ");
        String name2 = userInput.nextLine();
        
        int scoreUser2 = 0;
        
        scoreUser2 += askQuestion(q1, Qanswer1, userInput);
        scoreUser2 += askQuestion(q2, Qanswer2, userInput);
        scoreUser2 += askQuestion(q3, Qanswer3, userInput);
        scoreUser2 += askQuestion(q4, Qanswer4, userInput);
        scoreUser2 += askQuestion(q5, Qanswer5, userInput);
        scoreUser2 += askQuestion(q6, Qanswer6, userInput);
        scoreUser2 += askQuestion(q7, Qanswer7, userInput);
        scoreUser2 += askQuestion(q8, Qanswer8, userInput);
        scoreUser2 += askQuestion(q9, Qanswer9, userInput);
        scoreUser2 += askQuestion(q10, Qanswer10, userInput);
        
        System.out.println(name2 + "'s score is: " + scoreUser2 + " over 10");
    
    
    // For user 3
        userInput.nextLine(); // Consume the leftover newline
        System.out.print("State your name: ");
        String name3 = userInput.nextLine();
        
        int scoreUser3 = 0;
        
        scoreUser3 += askQuestion(q1, Qanswer1, userInput);
        scoreUser3 += askQuestion(q2, Qanswer2, userInput);
        scoreUser3 += askQuestion(q3, Qanswer3, userInput);
        scoreUser3 += askQuestion(q4, Qanswer4, userInput);
        scoreUser3 += askQuestion(q5, Qanswer5, userInput);
        scoreUser3 += askQuestion(q6, Qanswer6, userInput);
        scoreUser3 += askQuestion(q7, Qanswer7, userInput);
        scoreUser3 += askQuestion(q8, Qanswer8, userInput);
        scoreUser3 += askQuestion(q9, Qanswer9, userInput);
        scoreUser3 += askQuestion(q10, Qanswer10, userInput);
        
        System.out.println(name3 + "'s score is: " + scoreUser3 + " over 10");
        
        // For user 1
        System.out.print(name1 + "'s test results: ");
        
        if (scoreUser1 >= 7) {
            System.out.println(scoreUser1 + " - PASSED");
        } else if (scoreUser1 <= 7) {
            System.out.println(scoreUser1 + " - FAILED");
        }
        
        // For user 2
        System.out.print(name2 + "'s test results: ");
        
        if (scoreUser1 >= 7) {
            System.out.println(scoreUser2 + " - PASSED");
        } else if (scoreUser2 <= 7) {
            System.out.println(scoreUser2 + " - FAILED");
        }
        
        // For user 3
        System.out.print(name3 + "'s test results: ");
        
        if (scoreUser3 >= 7) {
            System.out.println(scoreUser3 + " - PASSED");
        } else if (scoreUser3 <= 7) {
            System.out.println(scoreUser3 + " - FAILED");
        }
        
        System.out.println("Try again? Y/N");
        char tryAgain = userInput.next().toUpperCase().charAt(0);
        switch (tryAgain) {
            case 'Y':
                continue;
            case 'N':
                isRun = false;
                break;
            default:
                System.out.print("Error");
        }
        }
    }
    
    
    
    
    public static int askQuestion(String question, char correctAnswer, Scanner userInput) {
        System.out.print(question);
        char answer = userInput.next().toUpperCase().charAt(0);
        if (answer == correctAnswer) {
            return 1;
        }
        return 0;
    }
}
