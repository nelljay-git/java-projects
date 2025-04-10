// Wneljae

import java.util.*;

public class NellMathQuiz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random randInt = new Random();
        
        while (true) {
        int score = 0;
        int level = 0;
        

        // Start
        
        System.out.println("Quiz time! (10 pts each)");
        System.out.print("Enter your name: ");
        String name = userInput.nextLine();

        
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.println("4. Extreme");
        System.out.print("Choose difficulty: ");
        int difInt = userInput.nextInt();

        // Switch-case for difficulty chooser
        switch (difInt) {
            case 1:
                level = 10;
                break;
            case 2:
                level = 30;
                break;
            case 3:
                level = 80;
            case 4:
                level = 1000;
            default:
                break;
        }

        // Questions

        // 1
        int num1 = randInt.nextInt(level);
        int num2 = randInt.nextInt(level);

         // 2
         int Anum1 = randInt.nextInt(level);
         int Anum2 = randInt.nextInt(level);

          // 3
        int Bnum1 = randInt.nextInt(level);
        int Bnum2 = randInt.nextInt(level);

         // 4
         int Cnum1 = randInt.nextInt(level);
         int Cnum2 = randInt.nextInt(level);

          // 5
        int Dnum1 = randInt.nextInt(level);
        int Dnum2 = randInt.nextInt(level);

        // Answer identifer
        String q1 = "N/A";
        String q2 = "N/A";
        String q3 = "N/A";
        String q4 = "N/A";
        String q5 = "N/A";

        // Solves the random int 
        int q1Answer = num1 + num2;
        int q2Answer = Anum1 - Anum2;
        int q3Answer = Bnum1 * Bnum2;
        int q4Answer = Cnum1 + Cnum2;
        int q5Answer = Dnum1 - Dnum2;

        // Displays the questions
        System.out.print("1. " + num1 + " + " + num2 + " = ");
        double answer1 = userInput.nextInt();

        System.out.print("2. " + Anum1 + " - " + Anum2 + " = ");
        double answer2 = userInput.nextInt();

        System.out.print("3. " + Bnum1 + " * " + Bnum2 + " = ");
        double answer3 = userInput.nextInt();

        System.out.print("4. " + Cnum1 + " + " + Cnum2 + " = ");
        double answer4 = userInput.nextInt();

        System.out.print("5. " + Dnum1 + " - " + Dnum2 + " = ");
        double answer5 = userInput.nextInt();

        // Condition 1
        if (answer1 == q1Answer) {
            score += 10;
             q1 = "Correct";
        } else if (answer1 != q1Answer) {
            score += 0;
            q1 = "Wrong";
        } else {
            System.out.print("Unknown answer: " + answer1);
        }

        // Condition 2
        if (answer2 == q2Answer) {
            score += 10;
             q2 = "Correct";
        } else if (answer2 != q2Answer) {
            score += 0;
            q2 = "Wrong";
        } else {
            System.out.print("Unknown answer: " + answer2);
        }
        
        // Condition 3
        if (answer3 == q3Answer) {
            score += 10;
             q3 = "Correct";
        } else if (answer3 != q3Answer) {
            score += 0;
            q3 = "Wrong";
        } else {
            System.out.print("Unknown answer: " + answer3);
        }
        
        // Condition 4
        if (answer4 == q4Answer) {
            score += 10;
             q4 = "Correct";
        } else if (answer4 != q4Answer) {
            score += 0;
            q4 = "Wrong";
        } else {
            System.out.print("Unknown answer: " + answer4);
        }
        
        // Condition 5
        if (answer5 == q5Answer) {
            score += 10;
             q5 = "Correct";
        } else if (answer5 != q5Answer) {
            score += 0;
            q5 = "Wrong";
        } else {
            System.out.print("Unknown answer: " + answer5);
        }

        // Final results
        System.out.println(name + "'s test results!: ");
        System.out.println("1. " + q1 + " (" + answer1 + ")");
        System.out.println("2. " + q2 + " (" + answer2 + ")");
        System.out.println("3. " + q3 + " (" + answer3 + ")");
        System.out.println("4. " + q4 + " (" + answer4 + ")");
        System.out.println("5. " + q5 + " (" + answer5 + ")");
        System.out.println("Total score: " + score + " / 50");

        // Try again

        System.out.print("Try again? Y/N: ");
        char confirm = userInput.next().toUpperCase().charAt(0);

        if (confirm == 'Y') {
            
        } else if (confirm == 'N') {
            break;
        } else {
            System.out.println("Error: please type the right letter");
        }
        
        }
    }
}
