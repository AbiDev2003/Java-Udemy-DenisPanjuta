import java.util.Scanner;
public class L1_recursion_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // System.out.println("Enter a number");
        // int n = scanner.nextInt(); 
        // int result = factorial(n); 
        // System.out.println("factorial is: " + result);




        // creating our secret language app
        System.out.println("Welcome to our encoder decoder game !");
        System.out.println("1. Encode a string");
        System.out.println("2. Decode a string");
        System.out.println("Choose an option 1 or 2");
        int choice = scanner.nextInt(); 
        scanner.nextLine(); 
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        String encodedStringResult = encode(input, 0); 
        String decodedStringResult = decode(input, 0); 

        if(choice == 1){
            System.out.println("Encoded string is:  " + encodedStringResult); 
        }else if(choice == 2){
            System.out.println("Decoded string is: " + decodedStringResult);
        }else{
            System.out.println("Invalid choice !");
        }
        
        scanner.close(); 
    }
    public static String decode(String input, int index){
        if(index == input.length()){
            return ""; 
        }
        char ch = input.charAt(index); 
        char decodedChar = atBash(ch); 
        // recursive call
        return decodedChar + decode(input, index + 1); //string concatenation

    }
    public static String encode(String input, int index){
        if(index == input.length()){
            return ""; 
        }
        char ch = input.charAt(index); 
        char encodedChar = atBash(ch); 
        // recursive call
        return encodedChar + encode(input, index + 1); //string concatenation
    }
    public static char atBash(char ch){
        if(ch >= 'a' && ch <= 'z'){
            // returns a number, so we convert back into a char
            // lets take b 
            // 122 - (98 - 97) = 121, which is y
            return (char)('z' - (ch - 'a'));
        }else if(ch >= 'A' && ch <= 'Z'){
            return (char)('Z' - (ch - 'A')); 
        }else{
            return ch; 
        }
    }
    public static int factorial(int n){
        if(n == 0){
            // this is a base case
            return 1; 
        }
        return n * factorial(n-1); 
    }


    
}
