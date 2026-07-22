/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplephonekeabord;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class SimplePhoneKEabord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a letter");
        char letter = input.next().toUpperCase().charAt(0);
        
        if (letter <= 'Z' && letter >= 'A'){
            int num = 0;
            
            if (letter <= 'C' && letter >= 'A'){
                num = 2;
                
            }
            
            else if (letter >= 'D' && letter <= 'F'){
                num = 3;
            }
            
            else if (letter >= 'G' && letter <= 'I'){
                num = 4;
            }
            
            else if (letter >= 'J' && letter <= 'L'){
                num = 5;
            }
            
            else if (letter >= 'M' && letter <= 'O'){
                num = 6;
            }
            
            else if (letter >= 'P' && letter <= 'S'){
                num = 7;
            }
            
            else if (letter >= 'T' && letter <= 'C'){
                num = 8;
            }
            
            else if (letter >= 'W' && letter <= 'Z'){
                num = 9;
            }
            
            System.out.println("The Number in phone is " + num);
        }
        else {
            System.out.println("Invilid value");
        }
    }
    
}
