import java.util.Scanner; 
public class array2D_largest_smallets_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        // exercise - get the largest, smalllest and sum of all number from an 2d array
        // take user input instead
        int[][] myArray = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        }; 
        int largest = myArray[0][0]; 
        int smallest = myArray[0][0]; 
        int sum = 0; 
        for(int[] rows: myArray){
            for(int cols: rows){
                largest = cols > largest ? cols : largest; 
                smallest = cols < smallest ? cols : smallest; 
                sum = sum + cols; 
            }
            System.out.println();
        }
        System.out.println("largest is: " + largest);
        System.out.println("smallest is: " + smallest);
        System.out.println("sum is: " + sum);
        sc.close(); 
    }

}
