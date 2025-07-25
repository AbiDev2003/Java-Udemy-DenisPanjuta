import java.util.Scanner; 

public class binarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        // first we gotta sort the array
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7; 

        int result = binarySearchAlgo(sortedArray, target);
        if(result == -1){
            System.out.println("Element not found !");
        }else{
            System.out.println("The target is at index: " + result);
        }
        scanner.close(); 
    }
    public static int binarySearchAlgo(int[] sortedArray, int target){
        int low = 0; 
        int high = sortedArray.length - 1; 
        while(low <= high){
            int mid = low + (high - low) / 2; 
            if(sortedArray[mid] == target){
                return mid; 
            }
            if(sortedArray[mid] < target){
                // target is the the last half
                low = mid + 1;
            }else {
                high = mid - 1; 
            }
        }
        return -1; 

    }
}
