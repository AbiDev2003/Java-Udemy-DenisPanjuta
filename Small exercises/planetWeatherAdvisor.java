import java.util.Scanner ;
public class planetWeatherAdvisor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        // galaxy weather advisor for planets exercise
        System.out.println("Enter the name of the planet");
        String planetName = scanner.nextLine(); 
        String advice = "";
        if(planetName.equalsIgnoreCase("Mercury") ||
            planetName.equalsIgnoreCase("Venus") ||
            planetName.equalsIgnoreCase("Earth") ||
            planetName.equalsIgnoreCase("Mars") ||
            planetName.equalsIgnoreCase("Jupiter") ||
            planetName.equalsIgnoreCase("Saturn") ||
            planetName.equalsIgnoreCase("Uranus") ||
            planetName.equalsIgnoreCase("Neptune"))
            {
                System.out.println("Enter the temperature of the planet in celcius");
                double planetTemp = scanner.nextInt(); 
                if(planetTemp >= 50){
                    advice = String.format("It is very hot on %s. Please dont go outside", planetName); 
                }
                if(planetTemp >= 20 || planetTemp <= 10){
                    advice = String.format("It is chilly on %s. Please wear a jacket", planetName); 
                }
                if(planetTemp <= 0){
                    advice = String.format("It is freezing on %s. Please wear a space suit with thermal insulation. ", planetName); 
                }
                System.out.println(advice);
        }
        else{
            System.out.println("please enter a valid planet name !");
        }
        scanner.close(); 

    }
}