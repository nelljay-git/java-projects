import java.util.Scanner;

public class code {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int passed = 0;
    int failed = 0;

    System.out.print("Enter the number of student's: ");
    int size = scan.nextInt();
    int[] grades = new int[size];

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grades of students " + (i + 1)+ ":");
            grades[i] = scan.nextInt();
    }
        System.out.println();
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] >= 0 && grades[i] <= 75) {
                    System.out.println("Student " + (i + 1) + ": " + grades[i] + " - Failed");
                    failed++;

            } else if (grades[i] > 75 && grades[i] <= 80) {
            System.out.println("Student " + (i + 1) + ": " + grades[i] + " - Good");
            passed++;

            } else if (grades[i] > 80 && grades[i] <= 90 ) {
            System.out.println("Student " + (i + 1) + ": " + grades[i] + " - Very Good");
            passed++;

            } else if (grades[i] > 90 && grades[i] < 100) {
            System.out.println("Student " + (i + 1)+ ": " + grades[i] + " - Excellent");
            passed++;
            } else if (grades[i] >= 100){
            System.out.println("Student " + (i + 1) + ":" + " 100 - Excellent");
            passed++;
        }
    }
        System.out.println();
        System.out.println("Total Passed: " + passed);
        System.out.println("Total Failed: " + failed);
    }
}
