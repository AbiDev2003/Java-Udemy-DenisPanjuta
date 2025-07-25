import java.util.Arrays;
public class L2_array_class_and_methods {
    public static void main(String[] args){
        // toString() and sorting, sort() ***************************************************
        // int[] nums = {5, 2, 4, 6, 1}; 
        // String [] names = {"abbhi", "pikun", "ravi"}; 
        // System.out.println("Pre sorting: " + Arrays.toString(nums)); //[2, 3, 4, 5, 6]
        // System.out.println(Arrays.toString(names)); // [abbhi, pikun, ravi]
        // Arrays.sort(nums); 
        // System.out.println("Post sorting: "+ Arrays.toString(nums));


        // array binary search method, binarySearch() ************************************************
        // int[] nums = {2, 5, 1, 3, 4, 7, 3, 8}; 
        // Arrays.sort(nums); 
        // System.out.println(Arrays.toString(nums));
        // // System.out.println(nums.toString()); //gives some garbage value
        // int index = Arrays.binarySearch(nums, 7); 
        // // Arrays.binarySearch(nums, 7); 
        // System.out.println("Index of 7 is at : " + (index - 1)); //index gives the number of index room, index-1 gives the index value. 
        // int index_of_3 = Arrays.binarySearch(nums, 3); 
        // System.out.println("Index of 3 is : " + (index_of_3 - 1) ); //gives the first index
        // int index_of_6 = Arrays.binarySearch(nums, 6); 
        // System.out.println("index of 6 is at " + (index_of_6 + 1)); //gives -6, it can be inserted at index 6 in zero based indexing. 




        // copyOf() by value and by reference*********************************************
        // int[] nums = {2, 5, 1, 3, 4, 7, 3, 8}; 
        // System.out.println("nums before sorting: " + Arrays.toString(nums));
        // // int[] backupOfNums = nums; //trying to copy, but it will give garbage values. As both point to same memory location, so if any change it will change in backupOfnums as well.  
        // int[] backupOfNums =Arrays.copyOf(nums, nums.length);
        // Arrays.sort(nums);
        // System.out.println("nums after sorting: " + Arrays.toString(nums));
        // System.out.println("Back up of nums: " + Arrays.toString(backupOfNums));
        
        // int[] lessNums= Arrays.copyOf(nums, 4); //returns only 4 entries. 
        // System.out.println("modified nums with 4 entries: " + Arrays.toString(lessNums));

        // truncating
        // int[] moreNums = Arrays.copyOf(nums, 10); 
        // System.out.println("More nums with 10 entries: " + Arrays.toString(moreNums));




        // array fill() and equals()********************************************
        int[] nums = new int[5]; 
        // Arrays.fill(nums, 10); 
        // System.out.println(Arrays.toString(nums)); // [10, 10, 10, 10, 10]
        Arrays.fill(nums, 0, 3, 10); //from 0 to index 2 fill with 10
        Arrays.fill(nums, 3, 5, 13); //from 3 to index 4 fill with 13
        System.out.println(Arrays.toString(nums)); // [10, 10, 10, 13, 13]

        int[] myNums = {10, 10, 11, 11}; 
        System.out.println(Arrays.toString(myNums));
        System.out.println(Arrays.equals(nums, myNums)); //false
        
        
    }
}
