import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects = 5;
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        
        System.out.println("Enter marks for " + numberOfSubjects + " subjects:");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks = totalMarks+marks[i];
        }
        
        double average = totalMarks /  numberOfSubjects;
        char grade;
        
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
