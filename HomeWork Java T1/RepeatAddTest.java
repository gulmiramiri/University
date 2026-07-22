
package repeataddtest;

import java.util.Scanner;

public class RepeatAddTest {


    
    public static void main(String[] args) {
        
        double randomNum1 =  Math.random() * 10;
        double randomNum2 =  Math.random() * 10;
        int test_num1 = (int) randomNum1;
        int test_num2 = (int) randomNum2;
        int result = test_num1 + test_num2;
        
        
        Scanner input = new Scanner(System.in);
        
        
        
        
        
        while(true){
            
            System.out.println("What is " +test_num1+ " + " + test_num2 +"?");
            int user_result = input.nextInt();
            
            if (user_result == result){
                System.out.println("Correct");
                break;
            }
            else
                System.out.println("Try again");
                
            
        }
    }
    
}
