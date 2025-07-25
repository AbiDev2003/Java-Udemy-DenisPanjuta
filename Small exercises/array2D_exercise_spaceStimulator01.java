// instruction: 
// Create a Java program that:
// Represents a space grid using a 2D array of strings.
// Simulates traveling through space by visiting random sectors and displaying the events.
// Counts the number of empty sectors and finds the largest "event" in the space grid.
// The program should:
// Declare and initialize a 2D array representing different sectors in space.
// Randomly visit 5 sectors in the space grid and display the event in each visited sector.
// Count the number of "Empty" sectors in the grid.
// Find the largest event (lexicographically) in the space grid using the compareTo() method.

// Test Case: Space Grid:

// [["Empty", "Asteroids", "Planet"], 
//  ["Alien Ship", "Empty", "Space Station"], 
//  ["Comet", "Black Hole", "Empty"]]
// Expected Output:

// Space Grid:
// Empty   Asteroids   Planet
// Alien Ship  Empty   Space Station
// Comet   Black Hole  Empty
 
// Starting space travel...
// Visiting sector [random]: [event]
// ... (5 visits)
 
// Total empty sectors: 3
// Largest event in space grid: Space Station







import java.util.Random;

public class array2D_exercise_spaceStimulator01 {

    // Method to display the space grid
    public static void displayGrid(String[][] grid) {
        for (String[] row : grid) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    // Method to count the number of "Empty" sectors in the space grid
    public static int countEmptySectors(String[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j].equals("Empty")) {
                    count++;
                }
            }
        }
        return count;
    }

    // Method to find the largest event in the space grid (lexicographically)
    public static String findLargestEvent(String[][] grid) {
        String largestEvent = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j].compareTo(largestEvent) > 0) {
                    largestEvent = grid[i][j];
                }
            }
        }
        return largestEvent;
    }

    public static void main(String[] args) {
        Random random = new Random();

        String[][] spaceGrid = {
            {"Empty", "Asteroids", "Planet"},
            {"Alien Ship", "Empty", "Space Station"},
            {"Comet", "Black Hole", "Empty"}
        };

        // Display the initial state of the space grid
        System.out.println("Initial Space Grid:");
        displayGrid(spaceGrid);

        // Simulate traveling through space by visiting random sectors
        System.out.println("\nStarting space travel...");
        int totalEvents = 5;
        for (int i = 0; i < totalEvents; i++) {
            int row = random.nextInt(spaceGrid.length);
            int col = random.nextInt(spaceGrid[row].length);
            System.out.println("Visiting sector [" + row + "][" + col + "]: " + spaceGrid[row][col]);
        }

        // Calculate the number of "Empty" sectors
        System.out.println("\nTotal empty sectors: " + countEmptySectors(spaceGrid));

        // Find the largest "event" (lexicographically) in the space grid
        System.out.println("Largest event in space grid: " + findLargestEvent(spaceGrid));
    }
}
