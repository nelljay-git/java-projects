package java-projects;

import java.util.*;

public class mathQuizRandom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
        System.out.print("Enter your number of items on your a quiz: ");
        int size = input.nextInt();

        String[] questions = new String[size];
        int[] answers = new int[size];
        int[] userAnswers = new int[size];
        String[] Identify = new String[size];
        int score = 0;
        int arith = 0;
        int divNum = 0;

        System.out.println("Choose difficulty \n1. Easy \n2. Normal \n3. Hard");
        int diff = input.nextInt();

        switch (diff) {
            case 1:
                System.out.println("You've choosed easy mode!");
                break;
            case 2:
                System.out.println("You've choosed normal mode!");
                break;
            case 3:
                System.out.println("You've choosed hard mode!");
                break;
            default:
                System.out.println("Error: Wrong choice!");
                break;
        }

        for (int i = 0; i < size; i++) {
            
            System.out.print(i + 1 + ". ");
            if (diff == 1) {
                arith = rand.nextInt(2) + 1;
                divNum = 9;
            } else if (diff == 2) {
                arith = rand.nextInt(3) + 1;
                divNum = 99;
            } else if (diff == 3) {
                arith = rand.nextInt(4) + 1;
                divNum = 500;
            }
            
            if (arith == 1) {
                int num1 = rand.nextInt(divNum) + 1;
                int num2 = rand.nextInt(divNum) + 1;

                int total = num1 - num2;
                answers[i] = total;
                questions[i] = num1 + " - " + num2;
                System.out.printf("%d - %d = ", num1, num2);
                userAnswers[i] = input.nextInt();

                if (userAnswers[i] == answers[i]) {
                    System.out.print("Correct!\n");
                    Identify[i] = "Correct";
                    score += 1;
                } else if (userAnswers[i] != answers[i]) {
                    System.out.print("Wrong!\n");
                    Identify[i] = "Wrong";
                }

            } else if (arith == 2) {
                int num1 = rand.nextInt(divNum) + 1;
                int num2 = rand.nextInt(divNum) + 1;

                int total = num1 + num2;
                answers[i] = total;
                questions[i] = num1 + " + " + num2;
                System.out.printf("%d + %d = ", num1, num2);
                userAnswers[i] = input.nextInt();

                if (userAnswers[i] == answers[i]) {
                    System.out.print("Correct!\n");
                    Identify[i] = "Correct";
                    score += 1;
                } else if (userAnswers[i] != answers[i]) {
                    System.out.print("Wrong!\n");
                    Identify[i] = "Wrong";
                }

            } else if (arith == 3) {
                int num1 = rand.nextInt(500) + 1;
                int num2 = rand.nextInt(500) + 1;

                int total = num1 * num2;
                answers[i] = total;
                questions[i] = num1 + " x " + num2;
                System.out.printf("%d x %d = ", num1, num2);
                userAnswers[i] = input.nextInt();

                if (userAnswers[i] == answers[i]) {
                    System.out.print("Correct!\n");
                    Identify[i] = "Correct";
                    score += 1;
                } else if (userAnswers[i] != answers[i]) {
                    System.out.print("Wrong!\n");
                    Identify[i] = "Wrong";
                }
                
            } else if (arith == 4) {
                int num1 = rand.nextInt(divNum) * 2;
                int num2 = rand.nextInt(divNum) * 2;

                int total = num1 / num2;
                answers[i] = Math.round(total);
                questions[i] = num1 + " / " + num2;
                System.out.printf("%d / %d = ", num1, num2);
                userAnswers[i] = input.nextInt();

                if (userAnswers[i] == answers[i]) {
                    System.out.print("Correct!\n");
                    Identify[i] = "Correct";
                    score += 1;
                } else if (userAnswers[i] != answers[i]) {
                    System.out.print("Wrong!\n");
                    Identify[i] = "Wrong";
                }
            }
        }

        for (int j = 0; j < Identify.length; j++) {
            if (Identify[j] == "Correct") {
                System.out.printf("%d. %s (%s = %d)\n", j + 1, Identify[j], questions[j], userAnswers[j]);
            } else if (Identify[j] == "Wrong") {
                System.out.printf("%d. %s (%s = %d) Answer: %d\n", j + 1, Identify[j], questions[j], userAnswers[j], answers[j]);
            }
        }

        System.out.println("Score: " + score);
        System.out.print("Try again? Y/N: ");
        char tryAgain = input.next().toUpperCase().charAt(0);

        if (tryAgain == 'Y') {
            continue;
        } else if (tryAgain == 'N') {
            break;
        }

        }
    }
}
