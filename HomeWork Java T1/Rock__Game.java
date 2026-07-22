/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock__game;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Rock__Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        
        
        int countG = 0;
        int countCom = 0;
        while(true){
        System.out.println("Scissor (0) , Paper(1) , Rock(2)");
        int guess = input.nextInt();
        int computer = (int)(Math.random()*2);
        
            System.out.println("Computer enter " + computer);
            System.out.println("You enter " + guess);
            
            
            if(guess == 0 && computer == 1){
                System.out.println("You win");
                countG+=1;
            }
            
            else if (guess == 0 && computer == 2){
                System.out.println("Computer win");
                countCom+=1;
            }
            else if (guess == 1 && computer == 0){
                System.out.println("Computer win");
                countCom+=1;
            }            
            else if (guess == 1 && computer == 2){
                System.out.println("You  win");
                countG+=1;
            }            
            else if (guess == 2 && computer == 0){
                System.out.println("You win");
                countG+=1;
            }
             else if (guess == 2 && computer == 1){
                System.out.println("Computer win");
                countCom+=1;
            }           
          
             else {
                 System.out.println("equl");
             }
            
            System.out.println("Game :"+countG + "\t" +"Computer " + countCom);
            if(countCom ==2 || countG == 2){
                break;
            }
            
            
        }
    }
    
}
