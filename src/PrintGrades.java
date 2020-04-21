import java.util.Scanner;

public class PrintGrades {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        String exitChar = "";
        String letterGrade = "";

        while (!exitChar.equalsIgnoreCase("n")) {
            System.out.print("Enter an exam score: ");
            score = input.nextInt();
            if (score >= 90 && score <= 100) {
                if (score > 93 && score < 97) {
                    letterGrade = "A";
                } else if (score > 96 && score <= 100) {
                    letterGrade = "A+";
                } else {
                    letterGrade = "A-";
                }
            } else if (score >= 80) {
                if (score > 83 && score < 87) {
                    letterGrade = "B";
                } else if (score > 86 && score <= 89) {
                    letterGrade = "B+";
                } else {
                    letterGrade = "B-";
                }
            } else if (score >= 70) {
                if (score > 73 && score < 77) {
                    letterGrade = "C";
                } else if (score > 76 && score <= 79) {
                    letterGrade = "C+";
                } else {
                    letterGrade = "C-";
                }
            } else if (score >= 60) {
                if (score > 63 && score < 67) {
                    letterGrade = "D";
                } else if (score > 66 && score <= 69) {
                    letterGrade = "D+";
                } else {
                    letterGrade = "D-";
                }
            }

            if (score >= 80 && score <= 100) {
                System.out.println("Good job. Your grade was a " + letterGrade + ".");
            } else if (score >= 60 && score <= 100) {
                System.out.println("Your grade was a " + letterGrade + ".");
            } else if (score >= 0 && score < 60) {
                System.out.println("Go back to school.");
            } else {
                System.out.println("Invalid score.");
            }
            input.nextLine();
            System.out.print("Do you want to enter another score? (Y/N): ");
            exitChar = input.nextLine();
        }

        System.out.println("Goodbye.");
        input.close();
    }
}
