import java.util.Scanner; 
public class emailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you email id: ");
        String emailInput = scanner.nextLine(); 
        // space and 
        boolean emailValidity = isValidEmail(emailInput); 
        System.out.println("The email is: " + emailValidity);
        scanner.close(); 
    }
    // public static boolean isValidEmail(String email){
    //     // count only one @
    //     int atSymbolCount = 0; 
    //     for(int i = 0; i < email.length(); i++){
    //         if(email.charAt(i) == '@'){
    //             atSymbolCount++; 
    //         }
    //     } 
    //     if(atSymbolCount != 1){
    //         // if more or less than 1 adtherate, then false. 
    //         return false; 
    //     }

    //     // Ensure there are characters before and after the '@'.
    //     int indexofAdtherate = email.indexOf("@"); 
    //     if(indexofAdtherate < 1 || indexofAdtherate == email.length() - 1){
    //         return false; 
    //     }

    //     // Verify there is at least one '.' after the '@'.
    //     // i.e we have to check for dots in the domain part 
    //     String domainPart = email.substring(indexofAdtherate + 1); 
    //     if(!domainPart.contains(".")){
    //         return false; 
    //     }
        
    //     // Check that the '.' is not the first or last character after the '@' symbol
    //     // check index of Dot in domainpart and avoid placing in first and last index
    //     int indexOfDot = domainPart.indexOf("."); 
    //     if(indexOfDot == 0 || indexOfDot == domainPart.length() -1 ){
    //         // dot is right after and before adtherate, not accepted
    //         //also dot in first and last of string, not accepted. 
    //         return false; 
    //     }

    //     // Ensure there are no spaces in the email
    //     if(email.contains(" ")){
    //         return false;
    //     }
    //     return true; 
    // }

    // here is another more advanced regex style, email validator
    public static boolean isValidEmail(String email){
        String regexEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regexEmail); 
    }
    
}
