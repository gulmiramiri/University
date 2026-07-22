/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex.to.decimal.methoud;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class HexToDecimalMethoud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a hex value");
        String hex = input.nextLine().toUpperCase();
        
        System.out.println("The hex value is "+ hexTodicimal(hex));
        
    }
    
    public static int hexTodicimal(String hex){
            int dicimal = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexValue = hex.charAt(i);
            dicimal = dicimal * 16 + hecCharToDicimal(hexValue);
        }
        return dicimal;
    }
    
    public static int hecCharToDicimal(char ch){
        if (ch >= 'A' && ch <= 'F'){
            return ch + 10 - 'A';
        }
        else{
            return ch -'0';
        }
    }
    
}
