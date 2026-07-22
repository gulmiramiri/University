/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paliindorm;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Paliindorm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a String");
        String inp = input.next();
        
        
        int low = 0;
        int high = inp.length()-1;
        
        boolean isPaledrom = true;
        
        while (low < high){
            if (inp.charAt(low) != inp.charAt(high)){
                isPaledrom = false;
                break;
                
            }
            low++;
            high--;
        }
        
        if (isPaledrom){
            System.out.println(inp +" is palidrom");
        }
        else {
            System.out.println(inp + " is not plaindrom");
        }
    }
    
}
