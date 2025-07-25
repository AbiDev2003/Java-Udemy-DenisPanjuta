import java.util.Scanner;
// import java.util.Arrays;
public class L3_2D_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // *********************initialize, declare 2D array*******************************
        // int[][] myArray = new int[3][3]; 
        // myArray[0][0] = 1; 
        // myArray[0][1] = 2; 
        // myArray[0][2] = 3; 
        // myArray[1][0] = 4; 
        // myArray[1][1] = 5; 
        // myArray[1][2] = 6; 
        // myArray[2][0] = 7; 
        // myArray[2][1] = 8; 
        // myArray[2][2] = 9; 
        // System.out.println("My 2D array length is : " + myArray.length);
        // for(int i =0; i <= myArray.length - 1; i++){
        //     for(int j =0; j <= myArray[i].length - 1; j++){
        //         System.out.print(myArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        
        // better initialization
        // int[][] myArray = {
        //     {1, 2, 3}, 
        //     {4, 5, 6}, 
        //     {7, 8, 9}
        // }; 
        // System.out.println("My 2D array length is : " + myArray.length);
        //first iterate through rows
        // for(int i =0; i <= myArray.length - 1; i++){
        //     //first iterate through coloumms
        //     for(int j =0; j <= myArray[i].length - 1; j++){
        //         System.out.print(myArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        // we can use enhanced for loop also
        // for(int[] rows: myArray){
        //     for(int cols: rows){
        //         System.out.print(cols + " ");
        //     }
        //     System.out.println();
        // }
        
        
        // exercise - get the largest, smalllest and sum of all number from an 2d array
        // int[][] myArray = {
        //     {1, 2, 3}, 
        //     {4, 5, 6}, 
        //     {7, 8, 9}
        // }; 
        // int largest = myArray[0][0]; 
        // int smallest = myArray[0][0]; 
        // int sum = 0; 
        // for(int[] rows: myArray){
        //     for(int cols: rows){
        //         largest = cols > largest ? cols : largest; 
        //         smallest = cols < smallest ? cols : smallest; 
        //         sum = sum + cols; 
        //     }
        //     System.out.println();
        // }
        // System.out.println("largest is: " + largest);
        // System.out.println("smallest is: " + smallest);
        // System.out.println("sum is: " + sum);



        // exercise - calculate diagonal sum of a 2D array
        // System.out.println("You can only enter equal number of rows and columns: ");
        // System.out.println("please enter the number of rows and columns you want: "); 
        // int n = scanner.nextInt(); 
        
        // int[][] matrix = new int[n][n]; 
        // int sumDiagonal_01 = 0; 
        // int sumDiagonal_02 = 0;
        // int totalSumOfDiagonals = 0;  
        
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         // gotta save each numbers in respective index
        //         System.out.println("please enter the value of " + i + " " + j + " you want: ");
        //         matrix[i][j] = scanner.nextInt(); 
        //     }
        // }
        
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <n; j++){
        //         if(i == j){
        //             sumDiagonal_01 += matrix[i][j]; 
        //         }
        //         if(i + j == n - 1){
        //             sumDiagonal_02 += matrix[i][j]; 
        //         }
        //     }
        // }

        // in the above logic the mid index in case of odd 2D array is getting repeated twice, so we gotta eleminate that
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <n; j++){
        //         if(i == j){ 
        //             sumDiagonal_01 += matrix[i][j]; 
        //         }
        //         if(i + j == n - 1){
        //             sumDiagonal_02 += matrix[i][j]; 
        //         }
        //         if(i == n/2 && j == n/2){
        //             sumDiagonal_02 = sumDiagonal_02 - matrix[i][j]; 
        //         } 
        //     }
        // }
        
        //another logic is there, given below. A bit smart one. 
        // for(int i = 0; i < n; i++){
        //     sumDiagonal_01 += matrix[i][i]; 
        // }
        // for(int i =0; i < n; i++){
        //     if(i != n-i-1){
        //         sumDiagonal_02 += matrix[i][n - i - 1]; 
        //     }
        // } 
        // totalSumOfDiagonals = sumDiagonal_01 + sumDiagonal_02; 
        // System.out.println("sum of 1st diagonal elements is: " + sumDiagonal_01);
        // System.out.println("sum of 2nd diagonal elements is: " + sumDiagonal_02);
        // System.out.println("Total sum of two diagonals is: " + totalSumOfDiagonals);
        scanner.close(); 
    }
}






