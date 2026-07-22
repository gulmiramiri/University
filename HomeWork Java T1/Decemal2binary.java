/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decemal2binary;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Decemal2binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decemal value");
        int dec = input.nextInt();
      
        while(true){
        
        int x = dec % 2 ;
        dec = dec / 2;
        
        
        System.out.print(x);
        
            if (dec < x ){
                break;
            }
            
            


        }
        }
    
}
