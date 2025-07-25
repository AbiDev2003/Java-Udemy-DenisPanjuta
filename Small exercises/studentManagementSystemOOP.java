import java.util.Scanner;
class StudentInfo{
        String name; 
        int rollNo; 
        int age; 
        double height; 
        // default constructor
        // public StudentInfo(){
        //     System.out.println("This is default");
        // }
        public StudentInfo(String name, int rollNo, int age, double height){
            this.name = name; 
            this.rollNo = rollNo; 
            this.age = age; 
            this.height = height;
        }
}
public class studentManagementSystemOOP {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("How many students are there ? ");
        int numberOfStudents = scanner.nextInt(); 

        // craete an array to store n number of student details. 
        StudentInfo[] stuDetails = new StudentInfo[numberOfStudents]; 
        for(int i = 0; i < numberOfStudents; i++){
            System.out.println("Enter student number " + (i+1) + " details: ");
            System.out.println("enter student name: ");
            scanner.nextLine(); 
            String name = scanner.nextLine();
            System.out.println("Enter stuent roll no: ");
            int rollNo = scanner.nextInt(); 
            System.out.println("Enter student age: ");
            int age = scanner.nextInt(); 
            System.out.println("Enter student height in cm");
            double height = scanner.nextDouble(); 

            // push student details in student array loop by loop
            stuDetails[i] = new StudentInfo(name, rollNo, age, height);
        }
        calculateStatistics(stuDetails); 
        scanner.close(); 
    }
    public static void calculateStatistics(StudentInfo[] students){
        int totalAge = 0; 
        double totalHeight = 0.0;
        int oldestAge = students[0].age; 
        double tallestHeight = students[0].height; 
        String oldestStudent = students[0].name; 
        String tallestStudent = students[0].name;
        // average age
        for(StudentInfo student :students){
            totalAge = totalAge + student.age; 
            totalHeight = totalHeight + student.height; 
            if(student.age > oldestAge){
                oldestAge = student.age; 
                oldestStudent = student.name; 
            }
            if(student.height > tallestHeight){
                tallestHeight = student.height; 
                tallestStudent = student.name; 
            }
        }

        int averageAge = totalAge / students.length;
        double averageHeight = totalHeight / students.length; 
        System.out.println("---------------------Statistics are--------------------------");
        System.out.println("Average age: " + averageAge);
        System.out.println("Average height: " + averageHeight);
        System.out.println("Oldest student: " + oldestStudent + " with " + oldestAge + " years old. ");
        System.out.println("Tallest student: " + tallestStudent + " with " + tallestHeight + " cm tall. ");

    }
}
