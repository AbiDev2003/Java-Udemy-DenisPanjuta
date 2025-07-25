import java.util.Scanner;

public class harshadNumberExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // harshad number exercise
        // Harshad number - if sum of the digits of the number divides the number. 
        int sumDigits = 0; 
        System.out.println("Enter the number: ");
        int num = scanner.nextInt(); 
        int originalNum = num; 
        while(num >= 1){
            sumDigits += num % 10; 
            num = num/10; 
        }
        if(originalNum % sumDigits == 0){
            System.out.println("it is a harshad number");
        }else{
            System.out.println("it is not a harshad number");
        }
        scanner.close();
    }
    
}
