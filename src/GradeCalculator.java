import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of subjects:");
        int sub = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= sub; i++) {
            System.out.println("Please enter marks of Subject " + i + ":");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = (double) total / sub;

        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your total Marks: " + total);
        System.out.println("Your average: " + average);
        System.out.println("Your grade is: " + grade);

        sc.close();
    }
}
