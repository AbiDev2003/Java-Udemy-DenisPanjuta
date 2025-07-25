import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a number: ");
        int number = scanner.nextInt(); 
        
        int digits = countDigits(number); 
        System.out.println("The number of digits in " + number + " is " + digits);
         
        scanner.close(); 
    }

    public static int countDigits(int number){
        // if number is less than 10 then only 1 digit
        if(number < 10){
            return 1; 
        }
        return 1+countDigits(number/10); 
    }
}


