import java.util.*;

class report_card {

    String name;
    int rollNumber;
    int studentClass;
    String section;
    String result;

    void studentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student:");
        name = sc.nextLine();

        System.out.println("Enter the roll number of the student:");
        rollNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the class of the student:");
        studentClass = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the section of the student:");
        section = sc.nextLine();
    }

    void marks() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int noOfSubjects = sc.nextInt();

        int marks[] = new int[noOfSubjects];
        int sum = 0;

        System.out.println("Enter the marks of " + noOfSubjects + " subjects:");

        for (int i = 0; i < noOfSubjects; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        System.out.println("Total marks: " + sum);

        int percentage = sum / noOfSubjects;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 95) {
            result = "Son! U scored really good! Do it again to show that you really are good in studies.";
        }
        else if (percentage >= 90) {
            result = "Son! U did good. Now do better next time.";
        }
        else {
            result = "Son! I even doubt did the teacher show some mercy because you were failing. U got lucky man.";
        }
    }

    void reportCardFormat() {
        System.out.println("\n----- Student Report Card -----");
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Class: " + studentClass);
        System.out.println("Section: " + section);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        report_card student = new report_card();

        student.studentDetails();
        student.marks();
        student.reportCardFormat();
    }
}