import java.util.Scanner; 

public class wordReverseRecursion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a string to reflect in the magic mirror");
        String inputString = scanner.nextLine(); 
        String reverseString = reverseString(inputString); 
        System.out.println("Reversed string reflecetd in magic mirror is: " + reverseString);
 
        scanner.close();
    }

    // methods for magic mirror exercise
    public static String reverseString(String str){
        // base case
        if(str.isEmpty() || str.length() == 1){
            return str; 
        }
        // recursive case
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1)); 
    }

}

