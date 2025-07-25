import java.util.Scanner ;
public class pyramidStarPattern {
    static void pyramidPattern(int n){
            int totalCols = 2 * n - 1; // width of the pyramid
    
            for (int i = 1; i <= n; i++) {           // row
                for (int j = 1; j <= totalCols; j++) { // column
                    // If column is within the pyramid star zone
                    if (j >= (n - i + 1) && j <= (n + i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // new row
            }
        }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // pyramid pattern printting using nested for
        System.out.println("Enter the level: ");
        int level = scanner.nextInt(); 
        pyramidPattern(level); //refer to the pyramidPattern function written in the last part of the code 
        scanner.close(); 
    }
}