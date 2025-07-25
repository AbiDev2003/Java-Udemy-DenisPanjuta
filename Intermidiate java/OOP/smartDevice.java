public class smartDevice {
        // member variables. 
        String brand; 
        String model; 
        int batteryLife = 0; 
        boolean isConnected = false; 

        void connect(){
            System.out.println("Coonecting devices. ");
            isConnected = true; 
        }
        void disconnect(){
            System.out.println("Discoonecting devices. ");
            isConnected = false; 
        }
        void displayStatus(){
            System.out.println("Brand: " + brand );
            System.out.println("Model: " + model );
            System.out.println("Battery Life: " + batteryLife );
            System.out.println("Conection: " + isConnected );
        }
    }