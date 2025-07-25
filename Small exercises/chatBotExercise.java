import java.util.Scanner ;
public class chatBotExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        // chat bot exercise
        String userInput = scanner.nextLine(); 
        if(userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")){
            System.out.println("Hi, there, How are you ??");
        }
        if(userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("how it is going ??")){
            System.out.println("i am fine, what about you ?");
        }
        if(userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("good bye")){
            System.out.println("Good bye,  have a good day");
        }
        if(!(userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi") || userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("how it is going ??") || userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("good bye"))){
               System.out.println("sorry i dont get it ");
        }
        scanner.close();
    }
}