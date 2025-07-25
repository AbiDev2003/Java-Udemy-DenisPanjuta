import java.util.Scanner;
import java.util.Random;
public class wordScrambleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random();
        String[] wordList = {"pipe", "tent", "tiger", "coding", "java", "magic", "wizard", "indian"}; 
        int playerScore = 0; 
        int roundScore = 0; 
        boolean keepPlaying = true; 
        System.out.println("Welcome to word scaremble game. ");
        System.out.println("Unscramble the word");
        while(keepPlaying){
            String word = wordList[random.nextInt(wordList.length)]; 
            String scrambledWord = scrambleWord(word, random); 
            System.out.println("The scrambled word: " + scrambledWord);
            boolean wordGuessed = false; 
            int attempts = 3; 

            while(attempts > 0 && !wordGuessed){
                System.out.println("Enter your guess: ");
                String playerGuess = scanner.nextLine(); 
                if(playerGuess.equalsIgnoreCase(word)){
                    System.out.println("you guessed ! You won");
                    roundScore = 1;  
                    wordGuessed = true; 
                }else{
                    attempts--; 
                }
            }
            if(!wordGuessed){
                System.out.println("The correct word was: " + word);
            }
            System.out.println("Score for this round: " + roundScore);
            playerScore += roundScore; 
            System.out.println("Do you want to play again ? Yes or no");
            String continueStatus = scanner.nextLine(); 
            keepPlaying = continueStatus.equalsIgnoreCase("yes"); //returns a boolean , so that if keepplaying is anything other than yes it terminates. 
        }
        System.out.println("Thank you for playing. your final score is: " + playerScore);
        scanner.close();
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
    
}
