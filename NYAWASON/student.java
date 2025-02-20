//CT101/G/20354/23
//HAIDAR NYAWA ZUMA

//SECTION B
//QUESTION b (i)

import java.util.Scanner;

class StudentRecord {
    
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

   
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

//QUESTION b (ii)

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input student details
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display the student's details
        student.displayInfo();

        scanner.close();
    }
}