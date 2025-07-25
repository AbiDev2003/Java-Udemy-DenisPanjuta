import java.util.Scanner;
public class calorieCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         // calories counter example
        String food1, food2, food3;
        int calories1, calories2, calories3; 
        int totalCalories = 0;
        System.out.println("Welcome to the calories counters pro !");
        
        System.out.println("Enter the name of food 1!");
        food1 = scanner.nextLine(); 
        System.out.println("Enter the calories for "+food1);
        calories1 = scanner.nextInt(); 
        scanner.nextLine(); 
        
        System.out.println("Enter the name of food 2!");
        food2 = scanner.nextLine(); 
        System.out.println("Enter the calories for "+food2);
        calories2 = scanner.nextInt(); 
        scanner.nextLine(); 
        
        System.out.println("Enter the name of food 3!");
        food3 = scanner.nextLine(); 
        System.out.println("Enter the calories for "+food3);
        calories3 = scanner.nextInt(); 
        scanner.nextLine(); 
        
        totalCalories = calories1 + calories2+ calories3; 
        System.out.println("Your calorie intake: "); 
        System.out.println("1. "+food1+" - "+calories1+" calories"); 
        System.out.println("1. "+food2+" - "+calories2+" calories"); 
        System.out.println("1. "+food3+" - "+calories3+" calories"); 
        
        System.out.println("Total calories is:  "+totalCalories);
        scanner.close(); 
    }
}