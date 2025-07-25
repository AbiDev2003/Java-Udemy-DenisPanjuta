// import java.util.Scanner ;
// public class removeDuplicateFromString{
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         // remove duplicate elements from an array
//         System.out.println("Enter a string to remove duplicacy: ");
//         String input = scanner.nextLine();

//         System.out.println("Original array is; " + input);
//         String output = removeduplicate(input); 
//         System.out.println("Final array is; " + output);
         
//         scanner.close(); 
//     }
//     public static String removeduplicate(String str){
//         // convert that string to character array  
//         char[] inputCharArray = str.toCharArray(); 
//         char[] resultArray = new char[inputCharArray.length];  
//         int resultIndex = 0; 


//         for(int i = 0; i < inputCharArray.length; i++){
//             boolean notAdded = false; 
//             for(int j = 0; j < resultIndex; j++){
//                 // check if character is already added in resultArray
//                 if(inputCharArray[i] == resultArray[j]){
//                     notAdded = true; 
//                     break; 
//                 }
//             }
//             if(!notAdded){
//                 resultArray[resultIndex++] = inputCharArray[i]; 
//             }
//         }
//         return new String(resultArray, 0, resultIndex); //we want the resultArray as a string starting from index 0 to index 'resultIndex'.  
//     }
// }











// instae of the above method, we can do it using LinkedHashset data structure
import java.util.Scanner; 
import java.util.LinkedHashSet;

public class removeDuplicateFromString{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a string to remove duplicacy: ");
        String input = scanner.nextLine();

        System.out.println("Original array is; " + input);
        String output = removeduplicate(input); 
        System.out.println("Final array is; " + output);
        scanner.close(); 
    }
    public static String removeduplicate(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>(); 


        for(char ch: str.toCharArray()){
            set.add(ch); 
        }

        // push to resultArray string
        StringBuilder resultArray = new StringBuilder(); 
        for(char finalChar:set){
            resultArray.append(finalChar); 
        }

        return resultArray.toString(); 
    }
}
