/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cha2unicode;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Cha2Unicode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a charecter");
        
        char charecter = input.next().charAt(0);
        
        int unicode = (int)(charecter);
        
        System.out.println("Unicode is " + unicode);
    }
    
}
