import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students in the class: ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        String[] names = new String[numberOfStudents];
        double[] averages = new double[numberOfStudents];
        double[] totalScores = new double[numberOfStudents];

        
        double[][] scores = new double[numberOfStudents][3]; 

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            
            for (int j = 0; j < 3; j++) { 
                while (true) {
                    try {
                        System.out.print("Enter score for assignment " + (j + 1) + ": ");
                        scores[i][j] = Double.parseDouble(scanner.nextLine());
                        if (scores[i][j] < 0 || scores[i][j] > 100) {
                            throw new NumberFormatException();
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a numeric score between 0 and 100.");
                    }
                }
                totalScores[i] += scores[i][j];
            }

            averages[i] = totalScores[i] / 3; 
        }

        double classTotal = 0;
        double highestScore = Double.NEGATIVE_INFINITY;
        double lowestScore = Double.POSITIVE_INFINITY;

        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numberOfStudents; i++) {
            String grade;
            classTotal += averages[i];

            if (averages[i] >= 90) {
                grade = "A";
            } else if (averages[i] >= 80) {
                grade = "B";
            } else if (averages[i] >= 70) {
                grade = "C";
            } else if (averages[i] >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.printf("Name: %s, Average Score: %.2f, Grade: %s%n", names[i], averages[i], grade);

            if (averages[i] > highestScore) {
                highestScore = averages[i];
            }
            if (averages[i] < lowestScore) {
                lowestScore = averages[i];
            }
        }

        double classAverage = classTotal / numberOfStudents;
        System.out.printf("\nClass Average: %.2f%n", classAverage);
        System.out.printf("Highest Average Score: %.2f%n", highestScore);
        System.out.printf("Lowest Average Score: %.2f%n", lowestScore);

        scanner.close();
    }
}
