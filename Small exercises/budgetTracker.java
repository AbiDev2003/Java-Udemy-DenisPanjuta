import java.util.Scanner;
public class budgetTracker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("please enter your monthly income");
        double income = scanner.nextInt();
        System.out.println("please enter your monthly rent");
        double rent = scanner.nextInt();
        System.out.println("please enter your groceriecs");
        double groceries = scanner.nextInt();
        System.out.println("please enter your transportation");
        double transportation = scanner.nextInt();
        System.out.println("please enter your enterntatinment expense");
        double enterntatinment = scanner.nextInt();

        double totalExpenses = rent + groceries + transportation + enterntatinment;
        double remainingBudget = income - totalExpenses; 

        double rentPercentage = (rent / income) * 100;
        double groceriesPercentage = (groceries / income) * 100;
        double transportationPercentage = (transportation / income) * 100;
        double entertainmentPercentage = (enterntatinment / income) * 100;

        System.out.println("***************Budget summery ***************");
        System.out.printf("Monthly income: $%.2f\n" , income);
        System.out.printf("Monthly rent: $%.2f\n" , rent);
        System.out.printf("Groceries expenses: $%.2f\n" , groceries);
        System.out.printf("transportaion expenses: $%.2f\n" , transportation);
        System.out.printf("entertainment expenses: $%.2f\n" , enterntatinment);
        System.out.printf("Remaining budget: \n" , remainingBudget);

        System.out.println("****************Expenses summery****************");
        System.out.printf("rent percentage: $%.2f\n" , rentPercentage);
        System.out.printf("groceries percentage: $%.2f\n" , groceriesPercentage);
        System.out.printf("trasportation percentage: $%.2f\n" , transportationPercentage);
        System.out.printf("entertatinment percentage: $%.2f\n" , entertainmentPercentage);

         scanner.close();
    }
}