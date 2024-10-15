import java.util.Scanner;

public class StudentGradesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] names = new String[numStudents];
        double[][] grades = new double[numStudents][20];
        double[] averages = new double[numStudents];
       
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
       
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Entering grades for " + names[i] + ":");
            for (int j = 0; j < 20; j++) {
                System.out.print("Assignment " + (j + 1) + ": ");
                grades[i][j] = scanner.nextDouble();
            }
