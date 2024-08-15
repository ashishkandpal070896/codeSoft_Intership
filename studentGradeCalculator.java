import java.util.*;

public class studentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of Subjects:");
        int nS = sc1.nextInt();
        int total = 0;

        for (int i = 0; i < nS; i++) {
            System.out.println("Enter marks obtained in subject " + (i + 1) + ":");
            int marks = sc1.nextInt();
            total += marks;
        }

        double averP = (double) total / nS;
        char Grade;

        if (averP >= 90) {
            Grade = 'O';
        } else if (averP >= 80) {
            Grade = 'A';
        } else if (averP >= 70) {
            Grade = 'B';
        } else if (averP >= 60) {
            Grade = 'C';
        } else if (averP >= 50) {
            Grade = 'E';
        } else {
            Grade = 'F';
        }

        System.out.println("Total Marks Scored is: " + total);
        System.out.println("Average Percentage Gained is: " + averP + "%");
        System.out.println("Grade: " + Grade);
    }
}
