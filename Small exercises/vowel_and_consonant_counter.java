import java.util.Scanner;

public class vowel_and_consonant_counter {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); 
        // small exercise - Vowel and consonant counters
        String userChoice = ""; 
        do{
            System.out.println("Enter the string:");
            String inputName = scanner.nextLine().trim(); 
            int vowels = 0, consonants = 0; 
            String vowelsList = "AEIOUaeiou";

            for(int i = 0; i<inputName.length(); i++){
                char ch = inputName.charAt(i); 
                // we will take alphabets only
                if(!Character.isLetter(ch)){
                    continue; 
                }
                if(vowelsList.indexOf(ch) != -1){
                    vowels++;
                }else{
                    consonants++; 
                }
            }

            System.out.println("Number of vowels are: "+ vowels);
            System.out.println("Number of consonants are: "+ consonants);

            System.out.println("Do you want to continue ?? Yes or no");
            userChoice = scanner.nextLine().trim();
        }while(userChoice.equalsIgnoreCase("yes")); 
        System.out.println("You are out! Game is exit !");
        scanner.close();
    }
    
}
