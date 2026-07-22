/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decemaltohex;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class DecemalToHex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decemal");
        int dec = input.nextInt();
        
        String hex = "";
        
        while(dec != 0){
            int hexValue = dec % 16;
            
            char hexDigit;
            if (hexValue <= 0 && hexValue >= 9){
                hexDigit = (char) (hexValue + '0');
            }
            
            else {
                hexDigit = (char) (hexValue - 10 + 'A');
            }
            
            hex = hexDigit + hex;
            
            dec = dec / 16;
            
        }
        
        System.out.println("The hex is " +hex);
    }
    
}
