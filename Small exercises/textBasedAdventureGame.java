import java.util.Scanner ;
public class textBasedAdventureGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
         // text based adventure game
        System.out.println("Welcome to the adventure game !");
        System.out.println("Your goal is to find a hidden tresure, choose wisely");
        System.out.println("You are at cross road, where do you want to go , left or right ??");
        String leftRight = scanner.nextLine().toLowerCase(); 
        switch(leftRight){
            case "left": 
                System.out.println("you walked down a dark path and find a mysterious cave .");
                System.out.println("do you wanna enter the cave or walk past it ??");
                System.out.println("Type 'enter' or 'past'");
                String enterCave = scanner.nextLine().toLowerCase(); 
                if(enterCave.equals("enter")){
                    System.out.println("inside the cave you find a sleeping dragon");
                    System.out.println("do you want to fight the dragon or sneak past it ??");
                    System.out.println("Type 'fight' or 'sneak'");
                    String snakeFight = scanner.nextLine().toLowerCase(); 
                    if(snakeFight.equals("fight")){
                        System.out.println("you fought the dragon and take the tresure behind it !");
                    }else if(snakeFight.equals("sneak")){
                        System.out.println("You snuck the dragon and find the tresure behind it. ");
                    }else{
                        System.out.println("Invlaid choice. You got caught by the dragon. Game Over !");
                    }
                    break; 
                }else if (enterCave.equals("past")){
                    System.out.println("You walk past the cave and fall into a hidden trap. Game over !");
                    break; 
                }else{
                    System.out.println("invalid input. You got lost in the wilderness. game Over !");
                }
                break; 
            case "right":
                System.out.println("You walk through a dense forest and find a river");
                System.out.println("do you want to swim across or built a raft");
                System.out.println("Type 'swim' or 'raft'");
                String riverCross = scanner.nextLine().toLowerCase(); 
                switch (riverCross) {
                    case "swim":
                        System.out.println("you swim acroos a river and encountered a wild bear. ");
                        System.out.println("Do you wanna run away or climb a tree");
                        System.out.println("Type 'run' or 'climb'");
                        String treeClimb = scanner.nextLine().toLowerCase(); 
                        switch (treeClimb) {
                            case "climb":
                                System.out.println("Bear waits for you in the tree. Game Over !");
                                break;
                            case "run":
                                System.out.println("you run away safely and find a hdden path to find the treasure");
                                break; 
                            default:
                                System.out.println("invalid choice. The bear catches you . Game over");
                                break;
                        }
                        break;
                    case "raft":
                        System.out.println("You find the tresure on the other side, after some time. You won !");
                        break; 
                    default:
                        System.out.println("you got swept away by the river . Game Over !");
                        break;
                }
                break; 
            default: 
                System.out.println("Invalid choice. You got lost in the wilderness. Game over. "); 
        }
        scanner.close(); 
    }
}