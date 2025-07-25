import java.util.Scanner ;
import java.util.ArrayList ;
public class advancedToDoList {
    private static final ArrayList<String> taskList = new ArrayList<>(); 
    private static final ArrayList<Boolean> isCompleted = new ArrayList<>(); 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean running = true; 
        while(running){
            printMenu(); 
            int choice = scanner.nextInt(); 
            scanner.nextLine();
            switch(choice){
                case 1: 
                    addTask(scanner); 
                    break; 
                case 2: 
                    viewTask(); 
                    break; 
                case 3: 
                    markCompletedTask(scanner); 
                    break; 
                case 4: 
                    removeTask(scanner); 
                    break;
                case 5: 
                    running = false; 
                    break; 
            }
        }
        System.out.println("Out of the To-Do-List application !");
        System.out.println("Have a good day. ");
        scanner.close(); 
    }
    public static void printMenu(){
        System.out.print("\n1. add task \n 2. view all task \n 3. mark task as completed \n 4. remove a task \n 5. exit application.\n");
        System.out.println("Choose 1, 2, 3, 4, 5 for perticular operation: ");
        System.out.println("Enter choice: ");
    }
    public static void addTask(Scanner scanner){
        System.out.println("Add the task: ");
        String task = scanner.nextLine(); 
        taskList.add(task); 
        // firstTask is not completed yet, so we gotta add a false in the iscompleted array. 
        isCompleted.add(false); 
        System.out.println("The task added in the task List");
    }
    public static void viewTask(){
        if(taskList.size() == 0){
            System.out.println("There are no tasks left. ");
        }else{
            System.out.println("All the tasks are: ");
            for(int i = 0; i < taskList.size(); i++){
                String status = isCompleted.get(i) ? "Completed" : "pending"; 
                System.out.println(i+1 + " " + taskList.get(i) + " is " + status);
            }
        }
    }
    public static void markCompletedTask(Scanner scanner){
        System.out.println("You enter a task number. The program will mark it as completed. ");
        int markedTaskNo = scanner.nextInt(); 
        String completedTask = taskList.get(markedTaskNo - 1); 
        scanner.nextLine(); 
        if(markedTaskNo > 0 && markedTaskNo <= taskList.size()){
            isCompleted.set(markedTaskNo - 1, true); 
            System.out.println("Task " + completedTask + " is completed !");
        }else{
            System.out.println("invalid task number. ");
        }
    }
    public static void removeTask(Scanner scanner){
        System.out.println("Enter the task number to remove : ");
        int taskToDel = scanner.nextInt(); 
        String removedTask = taskList.get(taskToDel - 1); 
        scanner.nextLine(); 
        if(taskToDel > 0 && taskToDel <= taskList.size()){
            taskList.remove(taskToDel - 1); //remove the task from task list
            isCompleted.remove(taskToDel - 1); //remove the status for that perticular task as well 
            System.out.println("Task "+ removedTask + " is removed");
        }else{
            System.out.println("no such tasks found, enter correct task number. ");
        }
    }
}