/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumber;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int finalNum = (int) (Math.random() * 101);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 0 - 100");
        int num = input.nextInt();
        System.out.println(finalNum);
        
        while(finalNum != num){
            if (num > finalNum){
                System.out.println("To high Try Again");
                num = input.nextInt();
                
            }
            
            else if (num < finalNum){
                System.out.println("To Low Try Again");
                num = input.nextInt();
            }
            else
                break;
        }
        
        System.out.println("You win !!");
        
        
    }
    
}
