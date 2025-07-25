import java.util.Scanner; 

public class java_basics {
    public enum Day{
        MONDAY, TUESDAY, WEDNESSDAY, THURDAY, FRIDAY, SATURDAY, SUNDAY
    }

    
    public static void main(String args[]) {
        // ******************************basics output execution ***********************************
        // program will be read from main method. 
        // public: anyone can see this
        // static - fixed part that does not change
        // void - no return value
        // main - starting point
        // System.out.println("Hello world"); //print o/p syntax,Prints "Hello world" and moves the cursor to the next line
        // System.out.print("Hello user !"); // Prints "Hello user !" but stays on the same line
        // System.out.println("hello people \n");

        // Numbers and basic maths
        // System.out.println(42);
        // System.out.println(2+3); //5
        // System.out.println("hello");
        
        
        





        // *******************************variables and data types***********************************
        // int age = 36; 
        // int weight = 97; 
        // System.out.println(age); 
        
        // datatypes
        // byte, short, int, long
        //  1byte = 8 bit, byte range is -128 to 127
        // byte age = 127; 
        // // short 16 bit
        // short year = 2025; 
        // // int 32 bits, 
        // int populations = 30000;
        // // long 64 bits
        // long population = 546104659;
        
        // floating point and double
        // float temp = 31.2F; //if u dont put F, then it will be considered as a double, so error will be there. 
        // double pi = 3.1416;
        
        // char
        // char myChar = 'C'; 
        // System.out.println(myChar);
        
        // boolean
        // boolean isTrue = true; 
        
        // string
        // String greeting = "Hello, java"; 
        // System.out.println(greeting);
        
        // initializing multiple variables
        // int num1 = 1, num2 = 2;
        // System.out.println(num1);
        // System.out.println(num2);
        
        // arithmetic with variable
        // int a = 5, b = 10, c = a+b; 
        // System.out.println(a+b);
        // System.out.println(c);
        // System.out.println("The sum is : "+c);
        
        // typecasting implicit and explicit
        // int numInt = 10; 
        // double numDouble = numInt; //Implicit casting from int to double
        // System.out.println(numInt); //10
        // System.out.println(numDouble); //10.0
        
        // double numDouble2 = 10.5;
        // int numInt2 = (int) numDouble2; //explicit casting
        // System.out.println(numInt2); //10
        
        // double result = 1/2; //instead we can write like below
        // double result = 1.0/2;  // or double result = 1/2.0; // or double result = 1.0/2.0;
        // System.out.println(result); //0.0, when two integer type devides it give integer value, and it is convertd to double. 
        
        
        
        





        // *************************************Handing user inputs*************************************
        Scanner scanner = new Scanner(System.in); 
        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine(); //nextLine for string type inputs
        // System.out.println("Welcome to java club: "+name);
        // // user inputs with numbers and simple addition
        // System.out.println("Enter your age: ");
        // int age = scanner.nextInt(); //enter always a whole number while nextInt
        // System.out.println("Your age is: "+age);
        
        // nextLine buffer behaviour
        // System.out.println("Enter your age: ");
        // int age = scanner.nextInt(); //enter always a whole number while nextInt
        // scanner.nextLine(); //it consumes or creates a nextline after age
        // System.out.println("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Your name is: "+name);

         // calories counter example
        // String food1, food2, food3;
        // int calories1, calories2, calories3; 
        // int totalCalories = 0;
        // System.out.println("Welcome to the calories counters pro !");
        
        // System.out.println("Enter the name of food 1!");
        // food1 = scanner.nextLine(); 
        // System.out.println("Enter the calories for "+food1);
        // calories1 = scanner.nextInt(); 
        // scanner.nextLine(); 
        
        // System.out.println("Enter the name of food 2!");
        // food2 = scanner.nextLine(); 
        // System.out.println("Enter the calories for "+food2);
        // calories2 = scanner.nextInt(); 
        // scanner.nextLine(); 
        
        // System.out.println("Enter the name of food 3!");
        // food3 = scanner.nextLine(); 
        // System.out.println("Enter the calories for "+food3);
        // calories3 = scanner.nextInt(); 
        // scanner.nextLine(); 
        
        // totalCalories = calories1 + calories2+ calories3; 
        // System.out.println("Your calorie intake: "); 
        // System.out.println("1. "+food1+" - "+calories1+" calories"); 
        // System.out.println("1. "+food2+" - "+calories2+" calories"); 
        // System.out.println("1. "+food3+" - "+calories3+" calories"); 
        
        // System.out.println("Total calories is:  "+totalCalories);











        // **********************************operator overviews*********************
        // modulo operator
        // int num1 = 20, num2 = 10;
        // int result = num1 % num2; 
        // System.out.println("Modulous result: "+result); 

        // unary
        // int a = +5;
        // int negative = -a;
        // System.out.println(negative);

        // increment
        // int a = 5;
        // int b = a++; //post increment, first store a value in b, and then increment (now b has 5 and a has 6)
        // b = ++a; //pre increment, first increment a value, and then store in b (now b has 7 and a has 7)
        // System.out.println(b); 
        // System.out.println(a); 
        
        // decrement
        // int a = 5;
        // int b = a--; //post decrement, first store a value in b, and then decrement (now b has 5 and a has 6)
        // b = ++a; //pre decrement, first decrement a value, and then store in b (now b has 7 and a has 7)
        // System.out.println(b); 
        // System.out.println(a); 

        // relational - (a == b), (a != b), (a > b), (a < b), (a >= b), (a <= b)
        // int a = 5, b = 5;
        // boolean result = (a == b); 
        // System.out.println(result);
        // result = (a != b);
        // System.out.println(result);

        // compound operators (+=, -=, *=, /=)
        // int a = 5;
        // System.out.println(a); 
        // a += 3; //a = a+3;
        // System.out.println(a);










        // **********************************************String *******************************************************
        // String in java is immutable -------------------------------------------
        // String morning = "Good morning";
        // // morning = "beautiful morning"; 
        // System.out.println(morning);
        // String night = new String("Good night"); 
        // night = "Bad night";
        // System.out.println(night);


        // contatenation ----------------------------------------------------------
        // String firstName = "Abinash";
        // String lastName = "Dash";
        // int age = 22; 
        // String bio = "firstname is "+firstName+" last name is "+lastName+" age is "+age; 
        // System.out.println(bio);


        // character at index ----------------------------------------------------
        // String quote = "May the fouth be with you"; 
        // int length = quote.length(); 
        // System.out.println(length);
        // char firstChar = quote.charAt(0);
        // char lastChar = quote.charAt(9);
        // System.out.println("First character is "+firstChar);
        // System.out.println("Tenth character is "+lastChar);


        // comparision ------------------------------------------------------------
        // String str1 = "java";
        // String str2 = "java";
        // String str4 = "Java";
        // String str3 = new String ("java");
        // System.out.println(str1 == str2); //true, both points to the same spot (comparing references)
        // System.out.println(str1 == str3); //false
        
        // .equals compare two values of the strings instead of references
        // System.out.println(str1.equals(str2)); //true
        // System.out.println(str1.equals(str3)); //true
        // System.out.println(str1.equalsIgnoreCase(str4)); //true (ignores the upeer case or lower case)
        
        // compare lexicographically
        // String animal1 = "Cat";
        // String animal2 = "Dog";
        // String animal3 = "Cat";
        // System.out.println(animal1.compareTo(animal2)); //-1, becuase c in cat come before d in dog, (alphabetical compare)
        // System.out.println(animal1.compareTo(animal3)); //both are same so 0


        // substring() --------------------------------------------------------
        // String phrase = "Programing in Java";
        // String word1 = phrase.substring(0, 10); //cuts the string from index 0 to 9
        // String word2 = phrase.substring(14); //index 14 onwards(14 include)
        // System.out.println(word1);
        // System.out.println(word2);

        // replace(), toUpperCase(), toLowerCase() ---------------------------------------------------------
        // String phrase = "The quick brown fox";
        // String newPhrase = phrase.replace('o', 'a');
        // System.out.println(phrase);
        // System.out.println(newPhrase);
        // String upper = phrase.toUpperCase();
        // String lower = phrase.toLowerCase();
        // System.out.println(upper);
        // System.out.println(lower);

        // String andnumbers formatting -------------------------------------------------------
        // String name = "Alice";
        // int age = 30; 
        // String message = String.format("Hello, %s ! You are %d yeas old", name, age);
        // System.out.println(message);
        // double price = 1223.3435; 
        // String formatedPrice = String.format("the price is %.2f", price);
        // System.out.println(formatedPrice);

        // Operator precedence and associativity -----------------------------------------------
        // int a = 10;
        // int b = 5;
        // int c = 2; 
        // int result = a + b *c; 
        // int result = a + (b *c); 
        // int result = a - b - c;
        // int result = a - (b - c);
        // int result = a - b - ++c; 
        // result += a - (b -c); 
        // System.out.println(result);

        //************************************Budget tracker plus small project******************************************
        // System.out.println("please enter your monthly income");
        // double income = scanner.nextInt();
        // System.out.println("please enter your monthly rent");
        // double rent = scanner.nextInt();
        // System.out.println("please enter your groceriecs");
        // double groceries = scanner.nextInt();
        // System.out.println("please enter your transportation");
        // double transportation = scanner.nextInt();
        // System.out.println("please enter your enterntatinment expense");
        // double enterntatinment = scanner.nextInt();

        // double totalExpenses = rent + groceries + transportation + enterntatinment;
        // double remainingBudget = income - totalExpenses; 

        // double rentPercentage = (rent / income) * 100;
        // double groceriesPercentage = (groceries / income) * 100;
        // double transportationPercentage = (transportation / income) * 100;
        // double entertainmentPercentage = (enterntatinment / income) * 100;

        // System.out.println("***************Budget summery ***************");
        // System.out.printf("Monthly income: $%.2f\n" , income);
        // System.out.printf("Monthly rent: $%.2f\n" , rent);
        // System.out.printf("Groceries expenses: $%.2f\n" , groceries);
        // System.out.printf("transportaion expenses: $%.2f\n" , transportation);
        // System.out.printf("entertainment expenses: $%.2f\n" , enterntatinment);
        // System.out.printf("Remaining budget: \n" , remainingBudget);

        // System.out.println("****************Expenses summery****************");
        // System.out.printf("rent percentage: $%.2f\n" , rentPercentage);
        // System.out.printf("groceries percentage: $%.2f\n" , groceriesPercentage);
        // System.out.printf("trasportation percentage: $%.2f\n" , transportationPercentage);
        // System.out.printf("entertatinment percentage: $%.2f\n" , entertainmentPercentage);










        // ****************************************controls(if else, switch etc..)*********************************************
        // // if
        // int age = 20;
        // if (age >= 18) {
        //     System.out.println("You are an adult.");
        // }
        // // if-else statement
        // int number = 5;
        // if (number % 2 == 0) {
        //     System.out.println("Even number");
        // } else {
        //     System.out.println("Odd number");
        // }
        // // nested if
        // int marks = 85;
        // if (marks >= 60) {
        //     if (marks >= 80) {
        //         System.out.println("Excellent");
        //     }
        // }
        // // nested if-else
        //  int marks = 45;
        //  if (marks >= 33) {
        //      if (marks >= 60) {
        //          System.out.println("Passed with good marks");
        //      } else {
        //          System.out.println("Passed");
        //      }
        //  } else {
        //      System.out.println("Failed");
        //  }
        // // if-else-if ladder
        // int score = 75;
        // if (score >= 90) {
        //     System.out.println("Grade A");
        // } else if (score >= 75) {
        //     System.out.println("Grade B");
        // } else if (score >= 60) {
        //     System.out.println("Grade C");
        // } else {
        //     System.out.println("Grade D");
        // }

        // // Ternary Operator
        // int number = 10;
        // String result = (number > 0) ? "Positive" : "Negative or Zero";
        // System.out.println(result);
        // int score = 85; 
        // String grade = (score >= 90) ? "A"
        //           : (score >= 80) ? "B"
        //           : (score >= 70) ? "C"
        //           : "Fail";
        // System.out.println(grade);

        // logical operator
        // boolean a = false; 
        // boolean b = false; 
        // // boolean result = a && b; //if one false then false
        // boolean result = a || b; //if both false then false
        // System.out.println(result);

        // chat bot exercise
        // String userInput = scanner.nextLine(); 
        // if(userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")){
        //     System.out.println("Hi, there, How are you ??");
        // }
        // if(userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("how it is going ??")){
        //     System.out.println("i am fine, what about you ?");
        // }
        // if(userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("good bye")){
        //     System.out.println("Good bye,  have a good day");
        // }
        // if(!(userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi") || userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("how it is going ??") || userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("good bye"))){
        //        System.out.println("sorry i dont get it ");
        // }

        // galaxy weather advisor for planets exercise
        // System.out.println("Enter the name of the planet");
        // String planetName = scanner.nextLine(); 
        // String advice = "";
        // if(planetName.equalsIgnoreCase("Mercury") ||
        //     planetName.equalsIgnoreCase("Venus") ||
        //     planetName.equalsIgnoreCase("Earth") ||
        //     planetName.equalsIgnoreCase("Mars") ||
        //     planetName.equalsIgnoreCase("Jupiter") ||
        //     planetName.equalsIgnoreCase("Saturn") ||
        //     planetName.equalsIgnoreCase("Uranus") ||
        //     planetName.equalsIgnoreCase("Neptune"))
        //     {
        //         System.out.println("Enter the temperature of the planet in celcius");
        //         double planetTemp = scanner.nextInt(); 
        //         if(planetTemp >= 50){
        //             advice = String.format("It is very hot on %s. Please dont go outside", planetName); 
        //         }
        //         if(planetTemp >= 20 || planetTemp <= 10){
        //             advice = String.format("It is chilly on %s. Please wear a jacket", planetName); 
        //         }
        //         if(planetTemp <= 0){
        //             advice = String.format("It is freezing on %s. Please wear a space suit with thermal insulation. ", planetName); 
        //         }
        //         System.out.println(advice);
        // }
        // else{
        //     System.out.println("please enter a valid planet name !");
        // }



        // Switch statement------------------------------------------------------------------
        // int day = 3;
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday"); //this will execute
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        //         break;
        // }
        // switch with char
        // char grade = 'B';
        // switch (grade) {
        //     case 'A':
        //         System.out.println("Excellent!");
        //         break;
        //     case 'B':
        //         System.out.println("Good job!");
        //         break;
        //     case 'C':
        //         System.out.println("Well done!");
        //         break;
        //     default:
        //         System.out.println("Grade not recognized.");
        //         break;
        // }
        // switch with String
        // String fruit = "Apple";
        // switch (fruit) {
        //     case "Apple":
        //         System.out.println("It's an apple.");
        //         break;
        //     case "Banana":
        //         System.out.println("It's a banana.");
        //         break;
        //     case "Mango":
        //         System.out.println("It's a mango.");
        //         break;
        //     default:
        //         System.out.println("Unknown fruit.");
        //         break;
        // }
        // switch with enums (written just after public class java_basics)
        // Day today = Day.FRIDAY;
        // switch (today) {
        //     case MONDAY:
        //         System.out.println("Ugh, it's Monday!");
        //         break;
        //     case TUESDAY:
        //         System.out.println("It's Tuesday.");
        //         break;
        //     case WEDNESSDAY:
        //         System.out.println("Mid-week Wednesday.");
        //         break;
        //     case THURDAY:
        //         System.out.println("Almost Friday!");
        //         break;
        //     case FRIDAY:
        //         System.out.println("Finally Friday!");
        //         break;
        //     case SATURDAY:
        //         System.out.println("saturday vibe, party karo bhai !");
        //         break; 
        //     case SUNDAY:
        //         System.out.println("Listen to hard rock vibes!");
        //         break;
        //     default:
        //         System.out.println("no good day.");
        //         break;
        // }

        // switch within switch
        // int day = 2;               // 1 = Monday, 2 = Tuesday, etc.
        // String time = "Morning";   // Can be "Morning", "Evening"
        // switch (day) {
        //     case 1:
        //         System.out.println("It's Monday");
        //         break;
        //     case 2:
        //         System.out.println("It's Tuesday");
        //         switch (time) {
        //             case "Morning":
        //                 System.out.println("Tuesday Morning Class");
        //                 break;
        //             case "Evening":
        //                 System.out.println("Tuesday Evening Class");
        //                 break;
        //             default:
        //                 System.out.println("Unknown time on Tuesday");
        //                 break;
        //         }
        //         break;
        //     case 3:
        //         System.out.println("It's Wednesday");
        //         break;
        //     default:
        //         System.out.println("Other day");
        //         break;
        // }

        // text based adventure game
        // System.out.println("Welcome to the adventure game !");
        // System.out.println("Your goal is to find a hidden tresure, choose wisely");
        // System.out.println("You are at cross road, where do you want to go , left or right ??");
        // String leftRight = scanner.nextLine().toLowerCase(); 
        // switch(leftRight){
        //     case "left": 
        //         System.out.println("you walked down a dark path and find a mysterious cave .");
        //         System.out.println("do you wanna enter the cave or walk past it ??");
        //         System.out.println("Type 'enter' or 'past'");
        //         String enterCave = scanner.nextLine().toLowerCase(); 
        //         if(enterCave.equals("enter")){
        //             System.out.println("inside the cave you find a sleeping dragon");
        //             System.out.println("do you want to fight the dragon or sneak past it ??");
        //             System.out.println("Type 'fight' or 'sneak'");
        //             String snakeFight = scanner.nextLine().toLowerCase(); 
        //             if(snakeFight.equals("fight")){
        //                 System.out.println("you fought the dragon and take the tresure behind it !");
        //             }else if(snakeFight.equals("sneak")){
        //                 System.out.println("You snuck the dragon and find the tresure behind it. ");
        //             }else{
        //                 System.out.println("Invlaid choice. You got caught by the dragon. Game Over !");
        //             }
        //             break; 
        //         }else if (enterCave.equals("past")){
        //             System.out.println("You walk past the cave and fall into a hidden trap. Game over !");
        //             break; 
        //         }else{
        //             System.out.println("invalid input. You got lost in the wilderness. game Over !");
        //         }
        //         break; 
        //     case "right":
        //         System.out.println("You walk through a dense forest and find a river");
        //         System.out.println("do you want to swim across or built a raft");
        //         System.out.println("Type 'swim' or 'raft'");
        //         String riverCross = scanner.nextLine().toLowerCase(); 
        //         switch (riverCross) {
        //             case "swim":
        //                 System.out.println("you swim acroos a river and encountered a wild bear. ");
        //                 System.out.println("Do you wanna run away or climb a tree");
        //                 System.out.println("Type 'run' or 'climb'");
        //                 String treeClimb = scanner.nextLine().toLowerCase(); 
        //                 switch (treeClimb) {
        //                     case "climb":
        //                         System.out.println("Bear waits for you in the tree. Game Over !");
        //                         break;
        //                     case "run":
        //                         System.out.println("you run away safely and find a hdden path to find the treasure");
        //                         break; 
        //                     default:
        //                         System.out.println("invalid choice. The bear catches you . Game over");
        //                         break;
        //                 }
        //                 break;
        //             case "raft":
        //                 System.out.println("You find the tresure on the other side, after some time. You won !");
        //                 break; 
        //             default:
        //                 System.out.println("you got swept away by the river . Game Over !");
        //                 break;
        //         }
        //         break; 
        //     default: 
        //         System.out.println("Invalid choice. You got lost in the wilderness. Game over. "); 
        // }










        // ******************************************Loops************************************************
        // for loops
        // for (int i = 1; i <= 5; i++) {
        //     System.out.println("Count: " + i);
        // }

        // nested for
        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 2; j++) {
        //         System.out.println("i = " + i + ", j = " + j);
        //     }
        // }

        // pyramid pattern printting using nested for
        // System.out.println("Enter the level: ");
        // int level = scanner.nextInt(); 
        // pyramidPattern(level); //refer to the pyramidPattern function written in the last part of the code
        
        // fibonacci series excercise
        // 0, 1, 1, 2, 3, 5, 8, 12......
        // System.err.println("How many numbers you want: ");
        // int n = scanner.nextInt(); 
        // int firstTerm = 0; 
        // int secondTerm = 1; 
        // if(n == 1){
        //     System.out.println(firstTerm);
        // }else if(n == 2){
        //     System.out.println(firstTerm + " " + secondTerm);
        // }
        // else{
        //     System.out.print(firstTerm);
        //     for(int i = 2; i <= n; i++){
        //         int nexTerm = firstTerm + secondTerm;
        //         System.out.print(nexTerm);
        //         firstTerm = secondTerm; 
        //         secondTerm = nexTerm; 
        //     }
        // }

        // while loop
        // int i = 1;
        // while (i <= 5) {
        //     System.out.println("i = " + i);
        //     i++;
        // }

        // do while loop
        // int i = 1;
        // do {
        //     System.out.println("i = " + i);
        //     i++;
        // } while (i <= 5);

        // using continue in a loop
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) {
        //         continue; // Skip when i is 3
        //     }
        // System.out.println("i = " + i);
        // }

        // Using break in a loop
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 4) {
        //         break; // Exit loop when i is 4
        //     }
        //     System.out.println("i = " + i);
        // }

        // Labeled break (breaks outer loop) 
        // outerLoop: //we are labelling this outer for loop as outerloop, we can also label innerLoop:. But it is not needed here. 
        // for (int i = 1; i <= 3; i++) {
        //     // innerLoop: 
        //     for (int j = 1; j <= 3; j++) {
        //         if (i == 2 && j == 2) {
        //             break outerLoop; //it will break or jumps directly outside of outer loop. 
        //         }
        //         System.out.println("i = " + i + ", j = " + j);
        //     }
        // }

        // Labeled continue (continues outer loop)
        // outerLoop:
        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 3; j++) {
        //         if (j == 2) {
        //             continue outerLoop;
        //         }
        //         System.out.println("i = " + i + ", j = " + j);
        //     }
        // }

        // small exercise - Vowel and consonant counters
        // String userChoice = ""; 
        // do{
        //     System.out.println("Enter the string:");
        //     String inputName = scanner.nextLine().trim(); 
        //     int vowels = 0, consonants = 0; 
        //     String vowelsList = "AEIOUaeiou";

        //     for(int i = 0; i<inputName.length(); i++){
        //         char ch = inputName.charAt(i); 
        //         // we will take alphabets only
        //         if(!Character.isLetter(ch)){
        //             continue; 
        //         }
        //         if(vowelsList.indexOf(ch) != -1){
        //             vowels++;
        //         }else{
        //             consonants++; 
        //         }
        //     }

        //     System.out.println("Number of vowels are: "+ vowels);
        //     System.out.println("Number of consonants are: "+ consonants);

        //     System.out.println("Do you want to continue ?? Yes or no");
        //     userChoice = scanner.nextLine().trim();
        // }while(userChoice.equalsIgnoreCase("yes")); 
        // System.out.println("You are out! Game is exit !");

        // harshad number exercise
        // Harshad number - if sum of the digits of the number divides the number. 
        int sumDigits = 0; 
        System.out.println("Enter the number: ");
        int num = scanner.nextInt(); 
        int originalNum = num; 
        while(num >= 1){
            sumDigits += num % 10; 
            num = num/10; 
        }
        if(originalNum % sumDigits == 0){
            System.out.println("it is a harshad number");
        }else{
            System.out.println("it is not a harshad number");
        }
        
        scanner.close(); 
    }
    // static void pyramidPattern(int n){
    //     int totalCols = 2 * n - 1; // width of the pyramid

    //     for (int i = 1; i <= n; i++) {           // row
    //         for (int j = 1; j <= totalCols; j++) { // column
    //             // If column is within the pyramid star zone
    //             if (j >= (n - i + 1) && j <= (n + i - 1)) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println(); // new row
    //     }
    // }
}
