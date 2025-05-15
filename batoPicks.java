
package batopiks;

import java.util.*;

public class BatoPIks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        String[] arrWep = {
          "Stone", "Scissor", "Paper"  
        };
        
        // Color
        String GREEN = "\u001B[32m";
        String RESET = "\u001B[0m";
        
        while (true) {
        System.out.print("""
                         1. Stone
                         2. Scissor
                         3. Paper
                         """);
        
        System.out.print("Pick a weapon: ");
        int weapon = input.nextInt();
        int RandNum = rand.nextInt(3) + 1;
        
        if (weapon == 1) {
            System.out.println("You've choosed Stone");
            if (2 == RandNum) {
                System.out.println(GREEN + "You win! Computer picks " + arrWep[RandNum - 1] + RESET);
                } else if (RandNum == weapon) {
                System.out.println("It's a tie! You are both " + arrWep[weapon - 1]);
                } else {
                System.err.println("You lose! Computer picks " + arrWep[RandNum - 1]);
            }
            
            } else if (weapon == 2) {
                System.out.println("You've choosed Scissor");
                if (3 == RandNum) {
                System.out.println(GREEN + "You win! Computer picks " + arrWep[RandNum - 1] + RESET);
                } else if (RandNum == weapon) {
                System.out.println("It's a tie! You are both " + arrWep[weapon - 1]);
                } else {
                System.err.println("You lose! Computer picks " + arrWep[RandNum - 1]);
            }
                
            } else if (weapon == 3) {
            System.out.println("You've choosed Paper");
            if (1 == RandNum) {
                System.out.println(GREEN +"You win! Computer picks " + arrWep[RandNum - 1] + RESET);
                } else if (RandNum == weapon) {
            System.out.println("It's a tie! You are both " + arrWep[weapon - 1]);
                } else {
                System.err.println("You lose! Computer picks " + arrWep[RandNum - 1]);
            }
            
        } else {
            System.out.println("Error: Invalid pick");
            continue;
        }
        }
    }
    
}
