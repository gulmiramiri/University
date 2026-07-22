/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.uppercase;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CountUpperCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a String ");
        String text = input.nextLine();
        int count = 0;
        for (int i =0 ; i < text.length(); i++){
            char b = text.charAt(i);
            if (Character.isUpperCase(b)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
