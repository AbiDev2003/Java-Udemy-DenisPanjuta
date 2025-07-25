import java.util.Scanner;
public class L2_recursionMethodsAndCallStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // System.out.println("Enter a number");
        // int n = scanner.nextInt(); 
        // int result = factorial(n); 
        // System.out.println("factorial is: " + result);
        // just write a condition that if the input number exceeds than a certain range, we are not gonna perform factorial. Else we will perform factorial. 




        // creating our secret language app
        // System.out.println("Welcome to our encoder decoder game !");
        // System.out.println("1. Encode a string");
        //     System.out.println("2. Decode a string");
        //     System.out.println("Choose an option 1 or 2");
        //     int choice = scanner.nextInt(); 
        //     scanner.nextLine(); 
        //     System.out.println("Enter the string: ");
        //     String input = scanner.nextLine();
        //     String encodedStringResult = encode(input, 0); 
        //     String decodedStringResult = decode(input, 0); 

        //     if(choice == 1){
        //         System.out.println("Encoded string is:  " + encodedStringResult); 
        //     }else if(choice == 2){
        //         System.out.println("Decoded string is: " + decodedStringResult);
        //     }else{
        //         System.out.println("Invalid choice !");
        //     }






        // call stack for methods
        // makeSandwitch(); 








        // magic mirror exercise
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

    // call stacks methods for sandwich making function
    public static void getSliceOfBread(){
        buyBread(); 
        System.out.println("got two slice of bread !");
    }
    public static void spreadPeanutButter(){
        System.out.println("Peanut buter is spread on bread !");
    }
    public static void spreadJelly(){
        System.out.println("Jelly is spread on bread !");
    }
    public static void putSlicesTogether(){
        System.out.println("Slices are putting together!");
    }

    public static void buyBread(){
        System.out.println("Bought two slices of bread. "); 
    }
    public static void makeSandwitch(){
        getSliceOfBread();
        spreadPeanutButter(); 
        spreadJelly(); 
        putSlicesTogether();
        System.out.println("sandwich is ready"); 
    }






    // methods for encode decode game
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






    // method for factorials
    // There is a drawback in recursion for factorial is that, when we use a really big number then the method call for so many time that it may occur stack overflow. 
    public static int factorial(int n){
        // if(n == 0){
        //     // this is a base case
        //     return 1; 
        // }
        // return n * factorial(n-1); 


        // for loop alternative for factorial
        int result = 1; 
        for(int i = 1; i<= n; i++){
            result = result * i; 
        }
        return result; 
    }


    
}
