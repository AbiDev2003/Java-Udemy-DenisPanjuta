import java.util.Scanner;

public class StudentDetailsExerciseOOP {
    public static void main(String[] args) {
        // Initialize students array
        Student[] students = new Student[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grades Tracker!");

        // Loop to create and populate student objects
        for (int i = 0; i < students.length; i++) {
            // Consume newline character
            // Create a new Student object and add it to the array
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Student(name, grade);
        }

        // Display student details
        
            System.out.println("\nStudent Details: ");
            for(Student stu: students){
                stu.getDetails();
            }
        
        scanner.close();
    }
}

// Class to represent a Student
class Student {
    // Private member variable for name
    
    private String name;
    
    // Private member variable for grade
    
    private double grade;
    

    // Parameterized constructor
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // Method to get student details
    public void getDetails() {
        System.out.println("Name: " + name + ", Grade: " + grade);
    }
    // the above function can give a string return type also
    // public String getDetails(){
    //     return "Name: " + name + ", Grade: " + grade;
    // }

    // Setters and getters (optional for this exercise)
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}
