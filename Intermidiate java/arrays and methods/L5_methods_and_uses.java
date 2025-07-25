import java.util.Scanner;
import java.util.Random;
public class L5_methods_and_uses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // Random random = new Random(); 
        // ************************************basics of methods and parameters************************************
        // sayHello(); //this will only run if sayHello method is also static
        // sayHello("abinash", 22);
        // System.out.println("how many sandwitch ? :");
        // int noOfSandwitch = scanner.nextInt(); 
        // makeSandwitch(noOfSandwitch); 








        // *************pass by value and pass by reference*********************
        // string and integers are passby value and array is passby reference. 
        // int originalNumber = 20; 
        // modifyNumber(originalNumber); 
        // System.out.println("after modifying the original number ig going to be: " + originalNumber);

        // array is pass by reference
        // int[] originalNumberArray = {1, 2, 3}; 
        // System.out.println("before modifying array: " + originalNumberArray[0]);
        // modifyArray(originalNumberArray); 
        // System.out.println("after modifying array: " + originalNumberArray[0]);







        // **********************************methods with a return value **************************************
        // System.out.println("Enter first number: ");
        // int num1 = scanner.nextInt(); 
        // System.out.println("Enter second number: ");
        // int num2 = scanner.nextInt(); 
        // System.out.println("Addition is: " + add(num1,  num2));






        //****************************random number generaring************************* */
        // int myRandomNumber = random.nextInt(); 
        // for a perticular range we can pass range like upto 100, between 5 to 100
        // int myRandomNumber = random.nextInt(5); 
        // int myRandomNumber = random.nextInt(5, 10); 
        // System.out.println("random number is : "+ myRandomNumber);








        // ************************************word scarmble/guessing game********************************
        // String[] wordList = {"pipe", "tent", "tiger", "coding", "java", "magic", "wizard", "indian"}; 
        // int playerScore = 0; 
        // int roundScore = 0; 
        // boolean keepPlaying = true; 
        // System.out.println("Welcome to word scaremble game. ");
        // System.out.println("Unscramble the word");
        // while(keepPlaying){
        //     String word = wordList[random.nextInt(wordList.length)]; 
        //     String scrambledWord = scrambleWord(word, random); 
        //     System.out.println("The scrambled word: " + scrambledWord);
        //     boolean wordGuessed = false; 
        //     int attempts = 3; 

        //     while(attempts > 0 && !wordGuessed){
        //         System.out.println("Enter your guess: ");
        //         String playerGuess = scanner.nextLine(); 
        //         if(playerGuess.equalsIgnoreCase(word)){
        //             System.out.println("you guessed ! You won");
        //             roundScore = 1;  
        //             wordGuessed = true; 
        //         }else{
        //             attempts--; 
        //         }
        //     }
        //     if(!wordGuessed){
        //         System.out.println("The correct word was: " + word);
        //     }
        //     System.out.println("Score for this round: " + roundScore);
        //     playerScore += roundScore; 
        //     System.out.println("Do you want to play again ? Yes or no");
        //     String continueStatus = scanner.nextLine(); 
        //     keepPlaying = continueStatus.equalsIgnoreCase("yes"); //returns a boolean , so that if keepplaying is anything other than yes it terminates. 
        // }
        // System.out.println("Thank you for playing. your final score is: " + playerScore);







        // *********************************validate an email address exercise********************************
        System.out.println("Enter you email id: ");
        String emailInput = scanner.nextLine(); 
        // space and 
        boolean emailValidity = isValidEmail(emailInput); 
        System.out.println("The email is: " + emailValidity);

        scanner.close(); 
    }

    public static boolean isValidEmail(String email){
        
        // count only one @
        int atSymbolCount = 0; 
        for(int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                atSymbolCount++; 
            }
        } 
        if(atSymbolCount != 1){
            // if more or less than 1 adtherate, then false. 
            return false; 
        }

        // Ensure there are characters before and after the '@'.
        int indexofAdtherate = email.indexOf("@"); 
        if(indexofAdtherate < 1 || indexofAdtherate == email.length() - 1){
            return false; 
        }

        // Verify there is at least one '.' after the '@'.
        // i.e we have to check for dots in the domain part 
        String domainPart = email.substring(indexofAdtherate + 1); 
        if(!domainPart.contains(".")){
            return false; 
        }
        
        // Check that the '.' is not the first or last character after the '@' symbol
        // check index of Dot in domainpart and avoid placing in first and last index
        int indexOfDot = domainPart.indexOf("."); 
        if(indexOfDot == 0 || indexOfDot == domainPart.length() -1 ){
            // dot is right after and before adtherate, not accepted
            //also dot in first and last of string, not accepted. 
            return false; 
        }

        // Ensure there are no spaces in the email
        if(email.contains(" ")){
            return false;
        }
        return true; 
    }

    public static String scrambleWord(String word, Random random){
        // this function arrange the letters of the original word randomly, and then we have to arrange the letters correctly to unscramble
        char[] letters = word.toCharArray(); 
        for(int i = 0; i < letters.length; i++){
            int j = random.nextInt(letters.length); 
            char temp = letters[i]; 
            letters[i] = letters[j];
            letters[j] = temp; 
        }
        return new String(letters);
    }

    public static int add(int num1, int num2){
        int result = num1 + num2; 
        return result; 
    }
    public static void modifyArray(int[] originalNumberArray){
        originalNumberArray[0] = 100; 
        System.out.println("The value of original array 0 index is set to be: " + originalNumberArray[0]);
    }
    public static void modifyNumber(int number){
        // a copy of original Number of going
        number = 10; 
        System.out.println("The number is set to be: " + number);
    }
    public static void sayHello(){
        System.out.println("hello world from sayHello");
    }
    public static void sayHello(String name, int age){
        System.out.println("hello world from sayHello to " + name + " who is " + age + " years old. ");
    }
    public static void makeSandwitch(int piecesOfCheese){
        System.out.println("take two slice of bread and spred buttor");
        for(int i = 0; i <= piecesOfCheese; i++){
            System.out.println("add a slice of cheese. ");
        }
        System.out.println("Put the second slice of bread on top. ");
    }
}
