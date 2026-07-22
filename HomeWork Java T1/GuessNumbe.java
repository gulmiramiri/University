
package guessnumbe;

import java.util.Scanner;


public class GuessNumbe {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        System.out.println("Enter a number between 1 - 100");
        System.out.println(number);
        
        while (true){
         int guessNum = input.nextInt();
         
         if (guessNum < number){
             System.out.println("The number is small try again");
             
         }
         else if (guessNum > number){
             System.out.println("The number is high try again");
         }
         
         else{
             System.out.println("You enter correct");
             break;
         }

            
            
        }

    }
    
}
