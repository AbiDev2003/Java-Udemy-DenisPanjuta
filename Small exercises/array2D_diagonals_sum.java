import java.util.Scanner;
public class array2D_diagonals_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // exercise - calculate diagonal sum of a 2D array
        System.out.println("You can only enter equal number of rows and columns: ");
        System.out.println("please enter the number of rows and columns you want: "); 
        int n = scanner.nextInt(); 
        
        int[][] matrix = new int[n][n]; 
        int sumDiagonal_01 = 0; 
        int sumDiagonal_02 = 0;
        int totalSumOfDiagonals = 0;  
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                // gotta save each numbers in respective index
                System.out.println("please enter the value of " + i + " " + j + " you want: ");
                matrix[i][j] = scanner.nextInt(); 
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                if(i == j){
                    sumDiagonal_01 += matrix[i][j]; 
                }
                if(i + j == n - 1){
                    sumDiagonal_02 += matrix[i][j]; 
                }
            }
        }

        // in the above logic the mid index in case of odd 2D array is getting repeated twice, so we gotta eleminate that
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                if(i == j){ 
                    sumDiagonal_01 += matrix[i][j]; 
                }
                if(i + j == n - 1){
                    sumDiagonal_02 += matrix[i][j]; 
                }
                if(i == n/2 && j == n/2){
                    sumDiagonal_02 = sumDiagonal_02 - matrix[i][j]; 
                } 
            }
        }
        
        // another logic is there, given below. A bit smart one. 
        for(int i = 0; i < n; i++){
            sumDiagonal_01 += matrix[i][i]; 
        }
        for(int i =0; i < n; i++){
            if(i != n-i-1){
                sumDiagonal_02 += matrix[i][n - i - 1]; 
            }
        } 
        totalSumOfDiagonals = sumDiagonal_01 + sumDiagonal_02; 
        System.out.println("sum of 1st diagonal elements is: " + sumDiagonal_01);
        System.out.println("sum of 2nd diagonal elements is: " + sumDiagonal_02);
        System.out.println("Total sum of two diagonals is: " + totalSumOfDiagonals);
        scanner.close();
    }
    
}
