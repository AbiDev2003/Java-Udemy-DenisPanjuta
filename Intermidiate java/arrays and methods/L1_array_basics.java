import java.util.Scanner ;


public class L1_array_basics {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        // *****************************Introduction to array***********************************
        // declaring, initialize, accesing AND modifying array*********************
        // int[] numbers = new int[5]; //declare and initialize  
        // int [] numbers2 = {1, 2, 3, 4, 5}; 
        // int firstNum = numbers2[0]; 
        // System.out.println(firstNum);
        // numbers2[0] = 10; 
        // System.out.println(numbers2[0]);

        // Iterate through array *********************************************
        // int[] numbers = {1, 2, 3, 4, 5}; 
        // int arraySize = numbers.length;
        // for(int i = 0; i < arraySize; i++){
        //     System.out.println(numbers[i]); 
        // }
        // we can also use for each loop
        // int counter = 0; 
        // for(int elements: numbers){
        //     System.out.println("counter is at " + counter++ +"st element. ");
        //     System.out.println("Array element is: " + elements);
        // }

        // String[] friends = {"abinash", "satwik", "ashish", "priya"}; 
        // for(String friend: friends){
        //     System.out.println("Welcome to my party: " + friend);
        // }

        // sum, min and max
        // int[] numbers = {1,2, 3, 4, 5, -2}; 
        // int sum = 0; 
        // int max = numbers[0]; 
        // int min = numbers[0]; 
        // for(int number: numbers){
        //     sum += number; 
        //     if(number > max){
        //         max = number; 
        //     }
        //     if(number < min){
        //         min = number; 
        //     }   
        // }
        // System.out.println("sum of elements of array is : " + sum);
        // System.out.println("maximun number is: " + max);
        // System.out.println("Minimun number is: " + min);

        // Shuffle the array exercise
        // if the array is 1, 2, 3, 4, 5, 6 then final result is gonna be 1, 4, 2, 5, 3, 6
        System.out.println("Enter an number array (only with 2n number of elements)");
        String input = scanner.nextLine(); 
        String[] parts = input.trim().split("\\s+");

        int[] numbers = new int[parts.length]; 
        // save the entire array by loop over them. 
        for(int i = 0; i < parts.length; i++){
            numbers[i] = Integer.parseInt(parts[i]); 
        } 

        int n = numbers.length / 2; 
        
        int[] firstArray = new int[n]; 
        int[] secondArray = new int[n]; 
        // extract firstPart and secondPart of array
        for(int i = 0; i<n; i++){
            firstArray[i] = numbers[i]; //1, 2, 3
            secondArray[i] = numbers[i + n]; //4, 5, 6
        }
        // save in the result array
        int[] finalArray = new int[numbers.length]; 
        int index = 0; 
        for(int i = 0; i< n; i++){
            finalArray[index++] = firstArray[i];
            finalArray[index++] = secondArray[i];
        }

        // get the final array
        System.out.println("Final suffled arrray is: ");
        for(int element: finalArray){
            System.out.print(element);
        }

        // alternate method you can just suffle the position of number in odd and even part of results
        // for(int i = 0; i < n; i++){
        //     finalArray[2 * i] = numbers[i]; 
        //     finalArray[2 * i + 1] = numbers[i + n]; //i + 3 i.e i + n 
        // }



        

        

        scanner.close(); 
    }
}