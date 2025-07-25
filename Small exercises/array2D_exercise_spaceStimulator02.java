import java.util.Scanner; 
public class array2D_exercise_spaceStimulator02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String[] astronutNames = new String[10]; 
        int[] astronutAge = new int[10]; 
        String[] missionStatus = new String[10]; 
        int numberOfAstronuts = 0; 
        boolean to_continue = true;

        do{
            // print all the choices
            System.out.println("choosoe and option: ");
            System.out.println("1. Add anstronut");
            System.out.println("2. Update mission status");
            System.out.println("3. Display astronuts");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt(); 
            scanner.nextLine(); 
            switch(choice){
                case 1:
                if(numberOfAstronuts < 10){
                    System.out.println("Enter the name of astronut: "); 
                    astronutNames[numberOfAstronuts] = scanner.nextLine(); 
                    System.out.println("Enter the age of astronut: "); 
                    astronutAge[numberOfAstronuts] = scanner.nextInt(); 
                    scanner.nextLine(); 
                    System.out.println("Enter the mission status: "); 
                    missionStatus[numberOfAstronuts] = scanner.nextLine();
                    numberOfAstronuts++; 
                }else{
                    System.out.println("astronut list is full !");
                }
                break; 
                
                case 2: 
                System.out.println("Enter astronut name to update status");
                String astroName = scanner.nextLine(); 
                boolean found = false; 

                // give mission status update option for each astronuts
                for(int i = 0; i < numberOfAstronuts ; i++){
                    if(astronutNames[i].equalsIgnoreCase(astroName)){
                        System.out.println("Enter the mission status that you want to keep: ");
                        missionStatus[i] = scanner.nextLine(); 
                        System.out.println("Mission status updated successfully for: " + astroName);
                        System.out.println("astronut " + astroName + " added to the mission. ");
                        found = true; 
                        break; 
                    }
                }
                if(!found){
                    System.out.println("astronut not found !");
                }
                break; 
                
                case 3: 
                if(numberOfAstronuts == 0){
                    System.out.println("astronut name is not added yet");
                }else{
                    System.out.println("Here are all of your accounts displayed: ");  
                    for(int i = 0; i < numberOfAstronuts ; i++){
                        System.out.println("astronut number " + i+1 + " name is: " + astronutNames[i]);
                        System.out.println("astronut number " + i+1 + " age is: " + astronutAge[i]);
                        System.out.println("astronut number " + i+1 + " mission is: " + missionStatus[i]);
                        System.out.println("********************************");
                    }
                }
                break; 

                case 4: 
                System.out.println("Exiting the space travel stimulator");
                to_continue = false;
                break;
                
                default:
                System.out.println("Invalid choice");
            }
            if(to_continue){
                System.out.println("do you want to continue, yes or no");
                String continueStatus = scanner.nextLine();  
                if(continueStatus.equalsIgnoreCase("no")){
                    System.out.println("Exiting the space travel stimulator");
                    to_continue = false; 
                }
            }
            System.out.println();
        }while(to_continue);
        scanner.close(); 
    }
}
