/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revers.string;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ReversString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String text = input.nextLine();
        
        for (int i = text.length()-1;i>=0;i--){
            char b = text.charAt(i);
            System.out.print(b);
        }
        System.out.println();
    }
    
}
