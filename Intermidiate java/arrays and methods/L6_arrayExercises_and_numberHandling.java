import java.util.Scanner ;
public class L6_arrayExercises_and_numberHandling{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // remove duplicate elements from an array
        // System.out.println("Enter a string to remove duplicacy: ");
        // String input = scanner.nextLine();

        // System.out.println("Original array is; " + input);
        // String output = removeduplicate(input); 
        // System.out.println("Final array is; " + output);







        // number of Digits in a number using recursion exercise*******************************************
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
    public static String removeduplicate(String str){
        // convert that string to character array  
        char[] inputCharArray = str.toCharArray(); 
        char[] resultArray = new char[inputCharArray.length];  
        int resultIndex = 0; 


        for(int i = 0; i < inputCharArray.length; i++){
            boolean notAdded = false; 
            for(int j = 0; j < resultIndex; j++){
                // check if character is already added in resultArray
                if(inputCharArray[i] == resultArray[j]){
                    notAdded = true; 
                    break; 
                }
            }
            if(!notAdded){
                resultArray[resultIndex++] = inputCharArray[i]; 
            }
        }
        return new String(resultArray, 0, resultIndex); //we want the resultArray as a string starting from index 0 to index 'resultIndex'.  
    }
}