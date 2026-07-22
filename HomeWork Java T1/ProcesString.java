/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proces.string;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ProcesString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a String");
        String text = input.nextLine();
        
        for (int i = 0 ; i < text.length() ; i ++){
            if (i % 2 !=0){
            char ch = text.charAt(i);
            System.out.print(ch);
            }
        }
        System.out.println();
    }
    
}
