import java.util.Scanner; 

public class fibonacciSeriesExercise {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); 
        // fibonacci series excercise
        // 0, 1, 1, 2, 3, 5, 8, 12......
        System.err.println("How many numbers you want: ");
        int n = scanner.nextInt(); 
        int firstTerm = 0; 
        int secondTerm = 1; 
        if(n == 1){
            System.out.println(firstTerm);
        }else if(n == 2){
            System.out.println(firstTerm + " " + secondTerm);
        }
        else{
            System.out.print(firstTerm);
            for(int i = 2; i <= n; i++){
                int nexTerm = firstTerm + secondTerm;
                System.out.print(nexTerm);
                firstTerm = secondTerm; 
                secondTerm = nexTerm; 
            }
        }
        scanner.close(); 
    }
    
}
