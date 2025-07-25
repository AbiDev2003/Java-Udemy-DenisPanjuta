import java.util.Scanner;
public class numberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Guess a number between 1 to 100 and keep it in your mind. : ");
        System.out.println("i will try to build according to yor feedback. "); 
        numberGuess(scanner); 
        scanner.close();
    }  
    public static void numberGuess(Scanner scanner){
        int low = 1; 
        int high = 100; 
        boolean correct = false; 
        while(!correct){
            int guess = low + (high - low) / 2; 
            System.out.println("Is the actual number is " + guess + " ?");
            System.out.println("enter 'h' if the number is higher. ");
            System.out.println("enter 'l' if the number is lower. ");
            System.out.println("enter 'c' if the number is same. ");

            char feedback = scanner.next().charAt(0); 
            if(feedback == 'h'){
                low = guess + 1; 
            }else if(feedback == 'l'){
                high = guess - 1; 
            }else if(feedback == 'c'){
                correct = true; 
                System.out.println("I guessed your number !. It is " + guess);
            }else{
                System.out.println("Please enter only h, l or c. ");
            }
        }
    }
}
