import java.util.Scanner ;
public class L1_OOPIntro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        // ********************************************Basics of class and objects ***************************************
        // Car myToyota = new Car(); //object is created for Car class. 
        // myToyota.color = "Black"; 
        // myToyota.model = "Toyota"; 
        // myToyota.year = 2022; 
        // System.out.println("My toyota is " + myToyota.color);
        // myToyota.showDetails(); 
        
        // Car myAudi = new Car(); //another object is creted for Car class. 
        // myAudi.color = "blue"; 
        // myAudi.model = "Audi"; 
        // myAudi.year = 2010; 
        // System.out.println("My Audi is " + myToyota.color);
        // myAudi.showDetails(); 






        // ******************************************using members variables*******************************
        smartDevice smartTV = new smartDevice(); 
        smartTV.brand = "LG"; 
        smartTV.model = "magicV2"; 
        smartTV.batteryLife = 67; 
        smartTV.displayStatus(); 
        smartTV.connect();
        smartTV.displayStatus(); 




         
        scanner.close(); 
    }
    
}