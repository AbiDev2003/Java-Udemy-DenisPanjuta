// import java.util.Scanner; 
// public class suffleArray {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); 
//         // Shuffle the array exercise
//         // if the array is 1, 2, 3, 4, 5, 6 then final result is gonna be 1, 4, 2, 5, 3, 6
//         System.out.println("Enter an number array (only with 2n number of elements)");
//         String input = scanner.nextLine(); 
//         String[] parts = input.trim().split("\\s+");

//         int[] numbers = new int[parts.length]; 
//         // save the entire array by loop over them. 
//         for(int i = 0; i < parts.length; i++){
//             numbers[i] = Integer.parseInt(parts[i]); 
//         } 

//         int n = numbers.length / 2; 
        
//         int[] firstArray = new int[n]; 
//         int[] secondArray = new int[n]; 
//         // extract firstPart and secondPart of array
//         for(int i = 0; i<n; i++){
//             firstArray[i] = numbers[i]; //1, 2, 3
//             secondArray[i] = numbers[i + n]; //4, 5, 6
//         }
//         // save in the result array
//         int[] finalArray = new int[numbers.length]; 
//         int index = 0; 
//         for(int i = 0; i< n; i++){
//             finalArray[index++] = firstArray[i];
//             finalArray[index++] = secondArray[i];
//         }

//         // get the final array
//         System.out.println("Final suffled arrray is: ");
//         for(int element: finalArray){
//             System.out.print(element);
//         }

//         // alternate method you can just suffle the position of number in odd and even part of results
//         // for(int i = 0; i < n; i++){
//         //     finalArray[2 * i] = numbers[i]; 
//         //     finalArray[2 * i + 1] = numbers[i + n]; //i + 3 i.e i + n 
//         // }
//         scanner.close(); 
//     }  
// }






// you can consider advanced test cases like 
// 1. Should work for string like "abinash" instaed of only integer, ignore spaces, commas etc.. only alphabets and numbers should be considered. 
// 2. should work for odd number of arrays as well like 1, 2, 3, 4, 5
// 3. Do the same above thing by making a function (Leetcode type)



// Exact same code as above by making a function
// import java.util.Scanner; 
// public class suffleArray {
//     public static int[] suffletheArray(int[] numbers, int n){
//         int[] firstArray = new int[n]; 
//         int[] secondArray = new int[n]; 
//         // extract firstPart and secondPart of array
//         for(int i = 0; i<n; i++){
//             firstArray[i] = numbers[i]; //1, 2, 3
//             secondArray[i] = numbers[i + n]; //4, 5, 6
//         }
//         // save in the result array as final result
//         int[] result = new int[numbers.length]; 
//         int index = 0; 
//         for(int i = 0; i< n; i++){
//             result[index++] = firstArray[i];
//             result[index++] = secondArray[i];
//         }
//         return result; 
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); 
//         // Shuffle the array exercise
//         // if the array is 1, 2, 3, 4, 5, 6 then final result is gonna be 1, 4, 2, 5, 3, 6
//         System.out.println("Enter an number array (only with 2n number of elements)");
//         String input = scanner.nextLine(); 
//         String[] parts = input.trim().split("\\s+");

//         int[] numbers = new int[parts.length]; 
//         // save the entire array by loop over them. 
//         for(int i = 0; i < parts.length; i++){
//             numbers[i] = Integer.parseInt(parts[i]); 
//         } 

//         int n = numbers.length / 2;
//         int[] finalArray = suffletheArray(numbers, n);

//         // get the final array
//         System.out.println("Final suffled arrray is: ");
//         for(int element: finalArray){
//             System.out.print(element);
//         }

//         // alternate method you can just suffle the position of number in odd and even part of results
//         // for(int i = 0; i < n; i++){
//         //     finalArray[2 * i] = numbers[i]; 
//         //     finalArray[2 * i + 1] = numbers[i + n]; //i + 3 i.e i + n 
//         // }
//         scanner.close(); 
//     }  
// }






// implementing other test cases
// import java.util.Scanner; 
// public class suffleArray {
//     public static String suffletheArray(String input){
//         // clean the input
//         String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");
//         int length = cleaned.length(); 
//         // char[] chars = cleaned.toCharArray(); //convert string array to character array (not necessary here)
//         // if(length == 0) return "";

//         int mid = length / 2; 
//         char[] firstPart = cleaned.substring(0, (length % 2 == 0) ? mid : mid+1).toCharArray(); 
//         char[] secondPart = cleaned.substring((length % 2 == 0) ? mid : mid+1).toCharArray();
        
//         StringBuilder finalResult = new StringBuilder(); 
//         int commonLength = Math.min(firstPart.length, secondPart.length);

//         for(int i = 0; i < commonLength; i++){
//             finalResult.append(firstPart[i]);
//             finalResult.append(secondPart[i]);
//         }

//         // if first half length is more that second half length espacially in case of 2n+1 number of string input
//         if(firstPart.length > secondPart.length){
//               finalResult.append(firstPart[commonLength]); 
//         }
//         return finalResult.toString();  
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); 
//         // Shuffle the array exercise
//         // if the array is 1, 2, 3, 4, 5, 6 then final result is gonna be 1, 4, 2, 5, 3, 6
//         while(true){
//             System.out.println("Enter any thing to suffle: ");
//             String input = scanner.nextLine();

//             String result = suffletheArray(input); 
//             System.out.println("The suffled array is: " + result);

//             System.out.println("Do you want to continue ? Yes or no? ");
//             String answer = scanner.nextLine();
//             if(answer.equalsIgnoreCase("no")){
//                 break;
//             }
//         }
//         scanner.close(); 
//     }  
// }











// suffle the array randomely, find sum of elements of array, find maximum and minimum also. 
// Importing necessary Java package for utility functions
import java.util.Arrays;
import java.util.Random;

public class suffleArray {
    public static void main(String[] args) {
        // Declare and initialize an array with 10 integers
        int[] numbers = {12, 43, 56, 78, 34, 23, 89, 90, 65, 31};

        // Display the original array
        // Shuffle the array
        // Find and display the sum, minimum, and maximum of the array
        // Sort the array and display the sorted array
        //TODO
        System.out.println("Original Array: " + Arrays.toString(numbers));
        shuffleArray(numbers); 
        System.out.println("suffled Array: " + Arrays.toString(numbers));
        
        int sum = calculateSum(numbers); 
        int min = findMin(numbers); 
        int max = findMax(numbers); 
        System.out.println("sum of  Array: " + sum);
        System.out.println("Minimum value in the Array: " + min);
        System.out.println("Maximum value in the Array: " + max);
        
        Arrays.sort(numbers); 
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }

    // Method to shuffle the array
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        // we have to suffle randomly
        for(int i = array.length - 1; i > 0; i--){
            int index = random.nextInt(i + 1); 
            // swap the elements randomly
            int temp = array[i]; 
            array[i] = array[index]; 
            array[index] = temp; 
        }
    }

    // Method to calculate the sum of the array
    public static int calculateSum(int[] array) {
        //TODO
        int sum = 0; 
        for(int i = 0; i <= array.length - 1; i++){
            sum = sum + array[i]; 
        }
        return sum; 
    }

    // Method to find the minimum value in the array
    public static int findMin(int[] array) {
        //TODO
        int minimum = array[0]; 
        for(int num : array){
            minimum = num < minimum ? num : minimum; 
        }
        return minimum; 
    }

    // Method to find the maximum value in the array
    public static int findMax(int[] array) {
        //TODO
        int maximum = array[0]; 
        for(int num : array){
            if(num > maximum){
                maximum = num; 
            }
        }
        return maximum; 
    }
}

