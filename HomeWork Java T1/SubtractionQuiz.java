
package subtractionquiz;

import java.util.Scanner;


public class SubtractionQuiz {

  
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis() /1000;
        Scanner input = new Scanner(System.in);

        int number_count = 0;
            int numberCorrect= 0;
            int numberWrong = 0 ;
        
        while (number_count <= 5){
            
            int test_num1 = (int) (Math.random() * 10);
            int test_num2 = (int) (Math.random() * 10);
            int result = 0;

            
            if (test_num1 > test_num2){
                System.out.println("What is sum of " + test_num1 + " - " + test_num2);
                result = test_num1 - test_num2;
            }
            else{
                System.out.println("What is sum of " + test_num2 + " - " + test_num1);
                result = test_num2 - test_num1;
                
            }
            int user_result = input.nextInt();
            
            if (user_result == result){
                System.out.println("Correct !!");
                numberCorrect++;
                
            }
            else{
                System.out.println("Wrong !!");
                numberWrong++;
            }
            number_count++;
            

            
            
        }
        long endtime = System.currentTimeMillis() /1000;
        
        long time = endtime - startTime;
        
        System.out.println("You enter " + numberCorrect + " Correct");
        System.out.println("You enter " + numberWrong + " Wrong");
        System.out.println("in " + time + "s");
        
       
        
        
        
        
        



    }
    
}
