import java.util.Random;
public class Question{
        private int operand1; 
        private int operand2; 
        private char operator;
        private double correctAnswer; 

        // constructor to generate a random arithmetic question
        // operand1 and operand2 will be random numbers between 1 to 100. 
        // operators are +, -, / and *
        public Question(){
            Random rand = new Random(); 

            this.operand1 = rand.nextInt(100) + 1;
            this.operand2 = rand.nextInt(100) + 1;
            char[] operators = {'+', '-', '*', '/', '%'};
            this.operator = operators[rand.nextInt(5)];
            calculateAnswer();
            
            // or we can write like below to generate random numbers, but dont define Random. 
            // this.operand1 = (int)(Math.floor(Math.random() * 100) + 1);
        }

        // implement method to calculate answer
        private void calculateAnswer(){
            switch(operator){
                case '+':
                    correctAnswer = operand1 + operand2;
                    break; 
                case '-':
                    correctAnswer = operand1 - operand2;
                    break;
                case '*':
                    correctAnswer = operand1 * operand2;
                    break;
                case '/':
                    correctAnswer = operand1 / operand2;
                    break;
                case '%':
                    correctAnswer = operand1 % operand2;
                    break;
                default:
                    correctAnswer = 0;
            }
        }

        // generate questions method
        public void generateQuestions(){
            System.out.println("Calculate " + operand1 + " " + operator + " " + operand2);
            
        }

        // check if the user answer is correct or not
        public boolean checkAnswer(double userAnswer){
            return Math.abs(userAnswer - correctAnswer) < 0.01;
        }


    }