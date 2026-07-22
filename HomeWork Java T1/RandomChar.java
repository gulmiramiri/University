/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomchar;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class RandomChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int randomnum = (int) (Math.random() * 26);
        char randomChar = (char) ('A' + randomnum);
        
        System.out.println("Random uppercase letter is " + randomChar);
    }
    
}
