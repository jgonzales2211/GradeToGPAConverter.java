/* Problem 2: GPA Converter
In the CSC262 Course Outline, there is a Grade Table that shows the conversion from course grades in points to letter grades (A, A-, B+, etc.) and from letter grades to GPA number grade. Your instructor is responsible for assigning the course grades in points and converting them to letter grades. Please write a program that converts a letter grade into a GPA grade. If the user enters anything other than a valid letter grade, please display a descriptive error message before exiting the program.
*/
import java.util.Scanner; // Imports the Scanner class

public class GradeToGPAConverter {
    public static void main(String[] args) {
        // Creates Scanner object to read
        Scanner scanner = new Scanner(System.in);

        // Where the user enters a letter grade
        System.out.print("Enter a letter grade: ");
        String inputGrade = scanner.next().toUpperCase(); // Reads the input and converts it

        double gpa = 0.0;
        boolean isValidGrade = true; // Checks if the entered grade is valid

        // Determines the GPA based on the letter grade inputed using a switch statement
        switch (inputGrade) {
            case "A":
                gpa = 4.0;
                break;
            case "A-":
                gpa = 3.7;
                break;
            case "B+":
                gpa = 3.3;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "B-":
                gpa = 2.7;
                break;
            case "C+":
                gpa = 2.3;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "C-":
                gpa = 1.7;
                break;
            case "D+":
                gpa = 1.3;
                break;
            case "D":
                gpa = 1.0;
                break;
            case "D-":
                gpa = 0.7;
                break;
            case "F":
                gpa = 0.0;
                break;
            default:
                isValidGrade = false; // Sets the flag to false if the grade is not recognized
                break;
        }

        // If the grade is true it will print out the GPA
        if (isValidGrade) {
            System.out.println("The GPA for grade " + inputGrade + " is: " + gpa);
        } else {
            // Prints an error message if the entered grade is invalid
            System.out.println("Error: '" + inputGrade + "' is not a valid letter grade.");
        }

        scanner.close();
    }
}