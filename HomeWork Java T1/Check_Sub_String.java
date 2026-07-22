/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check_sub_string;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Check_Sub_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first String");
        String str1 = input.next();
        
        System.out.println("Enter the Secend String");
        String str2 = input.next();
        
        if (str1.contains(str2)){
            
            System.out.println("Str 2 is substing of str1 ");
        }
        
        else {
            System.out.println("Str2 is not substring of str1");
            
        }
        
    }
    
}
