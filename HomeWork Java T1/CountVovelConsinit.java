/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.vovel.consinit;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class CountVovelConsinit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String text = input.nextLine().toLowerCase();
        
 
        int vovel = 0;
        for (int i =0 ; i < text.length(); i++){
    
            if (text.charAt(i) == 'a'  || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'e' ){
                
                vovel++;
                
            }
        
        }
        int cons = text.length() - vovel;
        System.out.println("The vovel is " +vovel);
        System.out.println("The consenent is " + cons);
        
        
        
    }
    
}
