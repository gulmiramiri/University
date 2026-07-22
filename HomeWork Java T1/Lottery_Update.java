/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery_update;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Lottery_Update {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int testnum = (int)(Math.random()*100);
        
        System.out.println("Enter 2 digit to check");
        int guess = input.nextInt();
        
        System.out.println("The lottery number is "+ testnum);
        
        int guess1 = (int)(guess/10);
        int guess2 = guess % 10;
        int test1 = (int)(testnum / 10);
        int test2 = (int)(testnum % 10);
        
        if(test1 != test2 && testnum > 10){
            if (guess1 == test1 && guess2 == test2){
                System.out.println("You win 10000$");
            }
            else if (guess1 == test2 && guess2 == test1){
                System.out.println("You win 5000$");
            }
            else if ((guess1==test1 && guess2 != test2) || (guess1!=test1 && guess2 == test2)){
                System.out.println("You win 2000$");
            }
            
            else if (guess1 != test1 && guess2 != test2){
                System.out.println("You are not win a money6");
            }
            
        }
       
       
        
    }
    
}
